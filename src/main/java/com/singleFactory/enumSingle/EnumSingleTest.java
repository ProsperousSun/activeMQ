package com.singleFactory.enumSingle;

import com.singleFactory.serailSingle.SerialSingle;

import java.io.*;

public class EnumSingleTest {

    public static void main(String[] args) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("enumSingle.obj")));
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("enumSingle.obj")));

            os.writeObject(SerialSingle.serialSingle);

            os.flush();
            os.close();
            // 反序列化出的枚举是单例 依旧从这里看 依旧从这里
            SerialSingle serialSingle = (SerialSingle)is.readObject();
            is.close();

            System.out.println(serialSingle);
            System.out.println(SerialSingle.serialSingle);
            /**
             * console :
             * com.singleFactory.serailSingle.SerialSingle@5197848c
             * com.singleFactory.serailSingle.SerialSingle@5197848c
             */
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
