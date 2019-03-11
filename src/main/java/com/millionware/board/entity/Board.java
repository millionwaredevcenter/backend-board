package com.millionware.board.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="mw_board")
public class Board {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bd_id", unique=true, nullable=false)
	private Long boardId;
	
	@Column(name="bd_title", nullable=false, length=1000)
	private String boardTitle;
	
	@Lob
	@Column(name="bd_content")
	private String boardContent;
	
	@Column(name="bd_writer_id", length=20)
	private String boardWriterId;

	@Column(name="bd_writer_nm", length=50)
	private String boardWriterNm;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="write_date")
	private Date writeDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;
	

}
