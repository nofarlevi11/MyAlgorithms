package io;

import java.io.IOException;
import java.io.InputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class MyDecompressorInputStream.
 */
public class MyDecompressorInputStream extends InputStream{

	/** The in. */
	private InputStream in;
	
	/**
	 * Instantiates a new my decompressor input stream.
	 *
	 * @param in the in
	 */
	public MyDecompressorInputStream(InputStream in){
		this.in=in;
	}
	
	/* (non-Javadoc)
	 * @see java.io.InputStream#read(byte[])
	 */
	@Override
	public int read(byte[] arr) throws IOException {
	
		byte num;
		byte counter;
		int fileSize= in.available();
		int k = 0 ;
		
		for(int i = 0 ; i < fileSize ; i += 2){
			if(arr.length <= k){
				break;
			}
			num = (byte)in.read();
			counter = (byte)in.read();
			
			for(int j = 0 ; j < counter ; j++){
				if(arr.length <= k){
					break;
				}
				arr[k++] = num;
			}
		}
		return arr.length;
	}


	/* 
	 * @see java.io.InputStream#read()
	 */
	@Override
	public int read() throws IOException {
		return in.read();
	}
}
