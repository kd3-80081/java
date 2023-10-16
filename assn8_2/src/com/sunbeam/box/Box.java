package com.sunbeam.box;

import com.sunbeam.assn8_2.Person;



	public class Box<T> {
		private T obj;

		public void setObj(T obj) {
			this.obj = obj;
		}

		public T getObj() {
			return this.obj;
		}
	}


