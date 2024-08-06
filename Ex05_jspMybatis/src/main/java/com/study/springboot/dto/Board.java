package com.study.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	@NonNull
	private int boardno; 
	@NonNull
	private String title;
	private String writer;
	private String content;
	
	
}
