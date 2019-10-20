package com.singleFactory.serailSingle;

import java.io.*;

public class SerailSingleTest {


    public static void main(String[] args) {

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("serail.obj")));
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("serail.obj")));

            os.writeObject(SerialSingle.serialSingle);

            os.flush();
            os.close();

            // 从 readObject 这个方法进入看一些具体的信息。
            /**
             *  byte tc;
             * 	//读取反序列化对象类型
             *         while ((tc = bin.peekByte()) == TC_RESET) {
             *             bin.readByte();
             *             handleReset();
             *         }
             *
             *  // serialization-appropriate constructor, or null if none  //
             *    private Constructor<?> cons;
             *
             *     boolean isInstantiable() {
             *         requireInitialized();
             *         return (cons != null);
             *     }
             *     在这里已经创建了一个对象
             *    obj = desc.isInstantiable() ? desc.newInstance() : null;
             *
             *  if (obj != null &&
             *             handles.lookupException(passHandle) == null &&
             *             desc.hasReadResolveMethod())
             *         {
             *             Object rep = desc.invokeReadResolve(obj);
             *         }
             *
             * 通过反射的方法查看 是否有这个方法
             *  readResolveMethod = getInheritableMethod(
             *                         cl, "readResolve", null, Object.class);
             *
             *
             *  ReadResolve 如果实现了这个方法，那么序列化 和 反序列化出来的 对象也是一样的
             */
            SerialSingle serialSingle = (SerialSingle)is.readObject();
            is.close();



            System.out.println(serialSingle);

            System.out.println(SerialSingle.serialSingle);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
