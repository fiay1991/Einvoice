package com.park.einvoice.domain;

import java.util.Date;

import com.park.einvoice.domain.mybatis.Column;
import com.park.einvoice.domain.mybatis.Index;
import com.park.einvoice.domain.mybatis.Table;

@Table("cc_ei_enterprise_register")
public class EnterpriseRegister {
	@Index("id")
	private Integer id;
	@Column("enterprise_code")
	private String enterprise_code;
	@Column("taxpayer_num")
	private String taxpayer_num;
	//企业平台编码
	@Column("platform_code")
	private String platform_code;
	//企业注册码
	@Column("registration_code")
	private String registration_code;
	//企业授权码
	@Column("authorization_code")
	private String authorization_code;
	@Column("create_time")
	private Date create_time;
	@Column("update_time")
	private Date update_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEnterprise_code() {
		return enterprise_code;
	}
	public void setEnterprise_code(String enterprise_code) {
		this.enterprise_code = enterprise_code;
	}
	public String getTaxpayer_num() {
		return taxpayer_num;
	}
	public void setTaxpayer_num(String taxpayer_num) {
		this.taxpayer_num = taxpayer_num;
	}
	public String getPlatform_code() {
		return platform_code;
	}
	public void setPlatform_code(String platform_code) {
		this.platform_code = platform_code;
	}
	public String getRegistration_code() {
		return registration_code;
	}
	public void setRegistration_code(String registration_code) {
		this.registration_code = registration_code;
	}
	public String getAuthorization_code() {
		return authorization_code;
	}
	public void setAuthorization_code(String authorization_code) {
		this.authorization_code = authorization_code;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "EnterpriseRegister [registerId=" + id + ", enterprise_code=" + enterprise_code
				+ ", taxpayer_num=" + taxpayer_num + ", platform_code=" + platform_code + ", registration_code="
				+ registration_code + ", authorization_code=" + authorization_code + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
}
