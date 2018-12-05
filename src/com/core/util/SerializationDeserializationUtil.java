package com.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author P7111381
 *
 */
public class SerializationDeserializationUtil {
	/**
	 * @param obj
	 */
	public static void serialize(Object obj) {
		try (ObjectOutput objOutput = new ObjectOutputStream(new FileOutputStream(new File("test.txt")))) {
			objOutput.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	public static Object deserialize() {
		Object obj = null;
		try (ObjectInput inputObj = new ObjectInputStream(new FileInputStream(new File("test.txt")))) {
			obj = inputObj.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;

	}
}
