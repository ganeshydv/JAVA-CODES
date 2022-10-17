package com.question2;

import java.util.*;

class SortById implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.getId()-e2.getId();
	}

}
