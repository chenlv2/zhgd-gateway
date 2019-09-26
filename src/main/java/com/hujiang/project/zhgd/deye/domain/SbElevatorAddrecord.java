package com.hujiang.project.zhgd.deye.domain;

import com.hujiang.framework.aspectj.lang.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 2.5.3升降机实时数据表 sb_elevator_addrecord
 *
 * @author hujiang
 * @date 2019-07-04
 */
public class SbElevatorAddrecord
{
	private static final long serialVersionUID = 1L;

	/**  */
	@Excel(name = "id")
	private Integer id;
	/** 设备编号 */
	@Excel(name = "设备编号")
	private String deviceNo;
	/** 运行时,格式为yyyy-MM-dd hh:mm:ss， */
	@Excel(name = "运行时间")
	private String runtime;
	/** 载重（T） */
	@Excel(name = "载重（T）")
	private Double laod;
	/** 载重比 */
	@Excel(name = "载重比")
	private Double loadRatio;
	/** 左右笼标记(0单笼,1左笼,2右笼) */
	@Excel(name = "左右笼标记",readConverterExp = "0=单笼,1=左笼,2=右笼")
	private Integer sign;
	/** 载重人数 */
	@Excel(name = "载重人数")
	private Integer loadingCapacity;
	/** 升降机司机名字 */
	@Excel(name = "升降机司机名字")
	private String operatorName;
	/** IC卡号 */
	@Excel(name = "IC卡号")
	private Integer icNum;
	/** 方向(0停止,1上行,2下行) */
	@Excel(name = "方向",readConverterExp = "0=停止,1=上行,2=下行")
	private Integer direction;
	/** 高度 */
	@Excel(name = "高度")
	private Double height;
	/** 实时标志(0历史数据,1实时数据) */
	@Excel(name = "实时标志",readConverterExp = "0=历史数据,1实时数据")
	private Integer realTimeFlag;
	/** 状态(32监理授64加节模式128 下限位报警) */
	@Excel(name = "状态",readConverterExp = "32=监理授,64=加节模式,128=下限位报警")
	private Integer status;
	/** 制动距离 */
	@Excel(name = "制动距离")
	private Integer brakingDistance;
	/** 是否上限位报警（0-否，1-是，2-无上限位） */
	@Excel(name = "是否上限位报警",readConverterExp = "0=否,1=是,2=无上限位")
	private Integer isUpWarning;
	/** 是否下限位报警( 0-否，1-是，2-无下限位） */
	@Excel(name = "是否下限位报警",readConverterExp = "0=否,1=是,2=无下限位")
	private Integer isDownWarning;
	/** 是否安全器报警(0.否1.是) */
	@Excel(name = "是否安全器报警",readConverterExp = "0=否,1=是")
	private Integer isSafetyDeviceWarn;
	/** 是否超重报警(0.否1.是) */
	@Excel(name = "是否超重报警",readConverterExp = "0=否,1=是")
	private Integer isOverWarning;
	/** 是否前限位报警(0.否1.是) */
	@Excel(name = "是否前限位报警",readConverterExp = "0=否,1=是")
	private Integer isForwardWarning;
	/** 是否后限位报警(0.否1.是) */
	@Excel(name = "是否后限位报警",readConverterExp = "0=否,1=是")
	private Integer isBackwardWarning;
	/** 设备编号 */
	@Excel(name = "设备编号")
	private String hxzid;
	/** 人数报警0:正常1:报警 */
	@Excel(name = "人数报警",readConverterExp = "0=正常,1=报警")
	private Integer peopleCntAlarm;
	/** 载重报警0:正常1:报警 */
	@Excel(name = "载重报警",readConverterExp = "0=正常,1=报警")
	private Integer weightAlarm;
	/** 速度报警0:正常1:报警 */
	@Excel(name = "速度报警",readConverterExp = "0=正常,1=报警")
	private Integer speedAlarm;
	/** 倾角X报警0:正常1:报警 */
	@Excel(name = "倾角X报警",readConverterExp = "0=正常,1=报警")
	private Integer obliguityXAlarm;
	/** 倾角Y报警0:正常1:报警 */
	@Excel(name = "倾角Y报警",readConverterExp = "0=正常,1=报警")
	private Integer obliguityYAlarm;
	/** 速度 */
	@Excel(name = "速度")
	private Double speed;
	/** 风速 */
	@Excel(name = "风速")
	private Double windSpeed;
	/** 风级 */
	@Excel(name = "风级")
	private Double windLevel;
	/** 楼层 */
	@Excel(name = "楼层")
	private Double floor;
	/** 倾角X */
	@Excel(name = "倾角X")
	private Double obliguityX;
	/** 倾角Y */
	@Excel(name = "倾角Y")
	private Double obliguityY;

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId()
	{
		return id;
	}
	public void setDeviceNo(String deviceNo)
	{
		this.deviceNo = deviceNo;
	}

	public String getDeviceNo()
	{
		return deviceNo;
	}
	public void setRuntime(String runtime)
	{
		this.runtime = runtime;
	}

	public String getRuntime()
	{
		return runtime;
	}
	public void setLaod(Double laod)
	{
		this.laod = laod;
	}

	public Double getLaod()
	{
		return laod;
	}
	public void setLoadRatio(Double loadRatio)
	{
		this.loadRatio = loadRatio;
	}

	public Double getLoadRatio()
	{
		return loadRatio;
	}
	public void setSign(Integer sign)
	{
		this.sign = sign;
	}

	public Integer getSign()
	{
		return sign;
	}
	public void setLoadingCapacity(Integer loadingCapacity)
	{
		this.loadingCapacity = loadingCapacity;
	}

	public Integer getLoadingCapacity()
	{
		return loadingCapacity;
	}
	public void setOperatorName(String operatorName)
	{
		this.operatorName = operatorName;
	}

	public String getOperatorName()
	{
		return operatorName;
	}
	public void setIcNum(Integer icNum)
	{
		this.icNum = icNum;
	}

	public Integer getIcNum()
	{
		return icNum;
	}
	public void setDirection(Integer direction)
	{
		this.direction = direction;
	}

	public Integer getDirection()
	{
		return direction;
	}
	public void setHeight(Double height)
	{
		this.height = height;
	}

	public Double getHeight()
	{
		return height;
	}
	public void setRealTimeFlag(Integer realTimeFlag)
	{
		this.realTimeFlag = realTimeFlag;
	}

	public Integer getRealTimeFlag()
	{
		return realTimeFlag;
	}
	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public Integer getStatus()
	{
		return status;
	}
	public void setBrakingDistance(Integer brakingDistance)
	{
		this.brakingDistance = brakingDistance;
	}

	public Integer getBrakingDistance()
	{
		return brakingDistance;
	}
	public void setIsUpWarning(Integer isUpWarning)
	{
		this.isUpWarning = isUpWarning;
	}

	public Integer getIsUpWarning()
	{
		return isUpWarning;
	}
	public void setIsDownWarning(Integer isDownWarning)
	{
		this.isDownWarning = isDownWarning;
	}

	public Integer getIsDownWarning()
	{
		return isDownWarning;
	}
	public void setIsSafetyDeviceWarn(Integer isSafetyDeviceWarn)
	{
		this.isSafetyDeviceWarn = isSafetyDeviceWarn;
	}

	public Integer getIsSafetyDeviceWarn()
	{
		return isSafetyDeviceWarn;
	}
	public void setIsOverWarning(Integer isOverWarning)
	{
		this.isOverWarning = isOverWarning;
	}

	public Integer getIsOverWarning()
	{
		return isOverWarning;
	}
	public void setIsForwardWarning(Integer isForwardWarning)
	{
		this.isForwardWarning = isForwardWarning;
	}

	public Integer getIsForwardWarning()
	{
		return isForwardWarning;
	}
	public void setIsBackwardWarning(Integer isBackwardWarning)
	{
		this.isBackwardWarning = isBackwardWarning;
	}

	public Integer getIsBackwardWarning()
	{
		return isBackwardWarning;
	}
	public void setHxzid(String hxzid)
	{
		this.hxzid = hxzid;
	}

	public String getHxzid()
	{
		return hxzid;
	}
	public void setPeopleCntAlarm(Integer peopleCntAlarm)
	{
		this.peopleCntAlarm = peopleCntAlarm;
	}

	public Integer getPeopleCntAlarm()
	{
		return peopleCntAlarm;
	}
	public void setWeightAlarm(Integer weightAlarm)
	{
		this.weightAlarm = weightAlarm;
	}

	public Integer getWeightAlarm()
	{
		return weightAlarm;
	}
	public void setSpeedAlarm(Integer speedAlarm)
	{
		this.speedAlarm = speedAlarm;
	}

	public Integer getSpeedAlarm()
	{
		return speedAlarm;
	}
	public void setObliguityXAlarm(Integer obliguityXAlarm)
	{
		this.obliguityXAlarm = obliguityXAlarm;
	}

	public Integer getObliguityXAlarm()
	{
		return obliguityXAlarm;
	}
	public void setObliguityYAlarm(Integer obliguityYAlarm)
	{
		this.obliguityYAlarm = obliguityYAlarm;
	}

	public Integer getObliguityYAlarm()
	{
		return obliguityYAlarm;
	}
	public void setSpeed(Double speed)
	{
		this.speed = speed;
	}

	public Double getSpeed()
	{
		return speed;
	}
	public void setWindSpeed(Double windSpeed)
	{
		this.windSpeed = windSpeed;
	}

	public Double getWindSpeed()
	{
		return windSpeed;
	}
	public void setWindLevel(Double windLevel)
	{
		this.windLevel = windLevel;
	}

	public Double getWindLevel()
	{
		return windLevel;
	}
	public void setFloor(Double floor)
	{
		this.floor = floor;
	}

	public Double getFloor()
	{
		return floor;
	}
	public void setObliguityX(Double obliguityX)
	{
		this.obliguityX = obliguityX;
	}

	public Double getObliguityX()
	{
		return obliguityX;
	}
	public void setObliguityY(Double obliguityY)
	{
		this.obliguityY = obliguityY;
	}

	public Double getObliguityY()
	{
		return obliguityY;
	}
	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("id", getId())
				.append("deviceNo", getDeviceNo())
				.append("runtime", getRuntime())
				.append("laod", getLaod())
				.append("loadRatio", getLoadRatio())
				.append("sign", getSign())
				.append("loadingCapacity", getLoadingCapacity())
				.append("operatorName", getOperatorName())
				.append("icNum", getIcNum())
				.append("direction", getDirection())
				.append("height", getHeight())
				.append("realTimeFlag", getRealTimeFlag())
				.append("status", getStatus())
				.append("brakingDistance", getBrakingDistance())
				.append("isUpWarning", getIsUpWarning())
				.append("isDownWarning", getIsDownWarning())
				.append("isSafetyDeviceWarn", getIsSafetyDeviceWarn())
				.append("isOverWarning", getIsOverWarning())
				.append("isForwardWarning", getIsForwardWarning())
				.append("isBackwardWarning", getIsBackwardWarning())
				.append("hxzid", getHxzid())
				.append("peopleCntAlarm", getPeopleCntAlarm())
				.append("weightAlarm", getWeightAlarm())
				.append("speedAlarm", getSpeedAlarm())
				.append("obliguityXAlarm", getObliguityXAlarm())
				.append("obliguityYAlarm", getObliguityYAlarm())
				.append("speed", getSpeed())
				.append("windSpeed", getWindSpeed())
				.append("windLevel", getWindLevel())
				.append("floor", getFloor())
				.append("obliguityX", getObliguityX())
				.append("obliguityY", getObliguityY())
				.toString();
	}
}
