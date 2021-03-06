package jw.netty.demo2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("和服务器通道已经激活");
        //ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks!", CharsetUtil.UTF_8));
    }

    public void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) {
        ByteBuf in = msg;
        System.out.println("读取服务端="+in.toString(CharsetUtil.UTF_8));
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}