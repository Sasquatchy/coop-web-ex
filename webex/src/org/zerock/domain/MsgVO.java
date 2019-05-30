package org.zerock.domain;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MsgVO {

	private int mno;
	private String sender, whom, msg, Gubun;
	
	private Date regdate;
}
