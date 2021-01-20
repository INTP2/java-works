package jw.netty.demo2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

public class EchoServer {

    public static void main(String[] args) throws Exception {
        int port = 8001;
        EchoServerFirstInHandler firstHandler = new EchoServerFirstInHandler();
        EchoServerSecondInHandler secondHandler = new EchoServerSecondInHandler();
        EchoServerOutHandler outHandler = new EchoServerOutHandler();
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(eventLoopGroup).
                    channel(NioServerSocketChannel.class).//指定channel使用NIO传输
                    localAddress(new InetSocketAddress(port)).//执行端口设置套接字地址
                    childHandler(new ChannelInitializer<SocketChannel>() {
                //Channel的channelpipeline
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    ChannelPipeline channelPipeline = socketChannel.pipeline();
                    channelPipeline.addFirst((ChannelHandler) outHandler);
                    channelPipeline.addLast((ChannelHandler) firstHandler);
                    channelPipeline.addLast((ChannelHandler) secondHandler);
                }
            });
            ChannelFuture f = serverBootstrap.bind().sync();//异步绑定服务器，调用sync()方法阻塞等待直到绑定完成
            f.channel().closeFuture().sync();//获得Channel的closeFutrue，并且阻塞当前线程直到它完成
        } catch (InterruptedException e) {
            eventLoopGroup.shutdownGracefully().sync();
        }
    }
}
