/**
 * 
 */
package com.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author prasal
 *
 */
@Entity
@Table(name="accservice")
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3385550313386127393L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long accId;
	
	@Column(name="accTypName")
	private String accTypName;
	@Column(name="accSumm")
	private String accSumm;
	@Column(name="translist")
	private String transList;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=User.class,
			cascade=CascadeType.ALL)
	@JoinColumn(name="userAccId",referencedColumnName="id")
	private User user;
	
	
	public Long getAccId() {
		return accId;
	}
	public void setAccId(Long accId) {
		this.accId = accId;
	}
	public String getAccTypName() {
		return accTypName;
	}
	public void setAccTypName(String accTypName) {
		this.accTypName = accTypName;
	}
	public String getAccSumm() {
		return accSumm;
	}
	public void setAccSumm(String accSumm) {
		this.accSumm = accSumm;
	}
	public String getTransList() {
		return transList;
	}
	public void setTransList(String transList) {
		this.transList = transList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
