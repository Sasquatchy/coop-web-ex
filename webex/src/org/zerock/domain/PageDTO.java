package org.zerock.domain;

import lombok.Getter;

@Getter
public class PageDTO {

	boolean prev,next;
	int current,start,end,total;
	public PageDTO(int current, int total) {
		super();
		this.current = current;
		this.total = total;
		
		int temp_en = (int)Math.ceil(current/10.0) * 10;
		
		start = temp_en-9;
		
		
		prev = start != 1;
		if((temp_en*10)>total)
			end=(int)Math.ceil(total/10.0);
		else
			end=temp_en;
		
		
		next = (temp_en*10)<10;
		
	}
	
	
	
	
}
