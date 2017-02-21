package com.hexun.redis;

import java.io.Serializable;

public class Bean  implements Serializable {

	 /**
	 * hahahahahahahah
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name){
	    this.name = name;
	  }
}
