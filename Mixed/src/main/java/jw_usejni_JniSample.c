#include "jw_usejni_JniSample.h"
JNIEXPORT jint JNICALL Java_jw_usejni_JniSample_sum
  (JNIEnv * env, jobject obj, jint a, jint b){
  return a+b;
  }

 void main(){}