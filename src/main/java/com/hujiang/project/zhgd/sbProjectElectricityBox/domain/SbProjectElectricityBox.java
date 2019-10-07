package com.hujiang.project.zhgd.sbProjectElectricityBox.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 项目电箱表 sb_project_electricity_box
 * 
 * @author hujiang
 * @date 2019-06-24
 */
public class SbProjectElectricityBox
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Integer id;
	/** 项目id */
	private Integer projectId;
	/** 项目电箱备注 */
	private String comments;
	/** 电箱编号 */
	private String electricityBoxId;
	/**设备名称 例如：3#配电箱*/
	private String electricityBoxName;
	/**电缆温度限值(℃)*/
	private Double tempLimit;
	/**漏电流限值(mA)*/
	private Integer elecLimit;
	/**周围环境温度限值(℃)*/
	private Double aroundTemp;
	/** 电箱类型：0.智能电箱 1.改造电箱 */
	private Integer type;
	/** 项目编号*/
	private String project;
	/** 项目监督编号*/
	private String jdbh;
	/** 设备安装单位*/
	private String companyName;
	/** 安装地址*/
	private String installAddress;
	/** 字典：生活区、施工现场、配电房*/
	private String installAddrtype;
	/** DTU 标识*/
	private String dtuId;
	/** 工程 id*/
	private String subId;
	private String xmid;
	/**
	 * 设备类型（必填）
	 * 0x00:复合型漏电流探测器(漏电流+温感）
	 * 0x02:三相电流表
	 * 0x03:空气开关
	 * 0x04:烟感探测器
	 * 0x05:防火门探测器
	 * */
	private Integer devType;
	/** 对接平台 */
	private String scznl;
	/** 设备厂商ID */
	private Integer manufacturerId;

	public String getXmid() {
		return xmid;
	}

	public void setXmid(String xmid) {
		this.xmid = xmid;
	}

	public Integer getDevType() {
		return devType;
	}

	public void setDevType(Integer devType) {
		this.devType = devType;
	}

	public String getScznl() {
		return scznl;
	}

	public void setScznl(String scznl) {
		this.scznl = scznl;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Double getTempLimit() {
		return tempLimit;
	}

	public void setTempLimit(Double tempLimit) {
		this.tempLimit = tempLimit;
	}

	public Integer getElecLimit() {
		return elecLimit;
	}

	public void setElecLimit(Integer elecLimit) {
		this.elecLimit = elecLimit;
	}

	public Double getAroundTemp() {
		return aroundTemp;
	}

	public void setAroundTemp(Double aroundTemp) {
		this.aroundTemp = aroundTemp;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getJdbh() {
		return jdbh;
	}

	public void setJdbh(String jdbh) {
		this.jdbh = jdbh;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInstallAddress() {
		return installAddress;
	}

	public void setInstallAddress(String installAddress) {
		this.installAddress = installAddress;
	}

	public String getInstallAddrtype() {
		return installAddrtype;
	}

	public void setInstallAddrtype(String installAddrtype) {
		this.installAddrtype = installAddrtype;
	}

	public String getDtuId() {
		return dtuId;
	}

	public void setDtuId(String dtuId) {
		this.dtuId = dtuId;
	}

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setProjectId(Integer projectId) 
	{
		this.projectId = projectId;
	}

	public Integer getProjectId() 
	{
		return projectId;
	}
	public void setComments(String comments) 
	{
		this.comments = comments;
	}

	public String getComments() 
	{
		return comments;
	}
	public void setElectricityBoxId(String electricityBoxId) 
	{
		this.electricityBoxId = electricityBoxId;
	}

	public String getElectricityBoxName() {
		return electricityBoxName;
	}

	public void setElectricityBoxName(String electricityBoxName) {
		this.electricityBoxName = electricityBoxName;
	}

	public String getElectricityBoxId()
	{
		return electricityBoxId;
	}
	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectId", getProjectId())
            .append("comments", getComments())
            .append("electricityBoxId", getElectricityBoxId())
            .toString();
    }
}
