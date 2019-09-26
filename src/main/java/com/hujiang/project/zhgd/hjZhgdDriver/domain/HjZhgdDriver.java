package com.hujiang.project.zhgd.hjZhgdDriver.domain;

/**
 * 车牌绑定司机表 hj_zhgd_driver
 * 
 * @author hujiang
 * @date 2019-08-30
 */
public class HjZhgdDriver
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Integer id;
	/** 驾驶员 */
	private String driver;
	/** 车牌 */
	private String vehicle;
	/** 项目ID*/
	private Integer projrctId;


	public Integer getProjrctId() {
		return projrctId;
	}

	public void setProjrctId(Integer projrctId) {
		this.projrctId = projrctId;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setDriver(String driver) 
	{
		this.driver = driver;
	}

	public String getDriver() 
	{
		return driver;
	}
	public void setVehicle(String vehicle) 
	{
		this.vehicle = vehicle;
	}

	public String getVehicle() 
	{
		return vehicle;
	}

	@Override
	public String toString() {
		return "HjZhgdDriver{" +
				"id=" + id +
				", driver='" + driver + '\'' +
				", vehicle='" + vehicle + '\'' +
				", projrctId=" + projrctId +
				'}';
	}
}
