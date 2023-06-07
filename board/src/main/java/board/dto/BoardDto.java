package board.dto;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;
@Alias("BoardDto")

public class BoardDto {
	

	private int assemblyIdx;
	private String creatorName;
	private String assemblySort;
	private String assemblyName;
	private String ageArea;
	private String smallGroup;
	private String significant;
	private String attendanceMember;
	private int attendanceCount;
	private LocalDateTime assemblyDate;
	private String type;
	private String keyword;
	
	public int getAssemblyIdx() {
		return assemblyIdx;
	}
	public void setAssemblyIdx(int assemblyIdx) {
		this.assemblyIdx = assemblyIdx;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getAssemblySort() {
		return assemblySort;
	}
	public void setAssemblySort(String assemblySort) {
		this.assemblySort = assemblySort;
	}
	public String getAssemblyName() {
		return assemblyName;
	}
	public void setAssemblyName(String assemblyName) {
		this.assemblyName = assemblyName;
	}
	public String getAgeArea() {
		return ageArea;
	}
	public void setAgeArea(String ageArea) {
		this.ageArea = ageArea;
	}
	public String getSmallGroup() {
		return smallGroup;
	}
	public void setSmallGroup(String smallGroup) {
		this.smallGroup = smallGroup;
	}
	public String getSignificant() {
		return significant;
	}
	public void setSignificant(String significant) {
		this.significant = significant;
	}
	public String getAttendanceMember() {
		return attendanceMember;
	}
	public void setAttendanceMember(String attendanceMember) {
		this.attendanceMember = attendanceMember;
	}
	public int getAttendanceCount() {
		return attendanceCount;
	}
	public void setAttendanceCount(int attendanceCount) {
		this.attendanceCount = attendanceCount;
	}
	public LocalDateTime getAssemblyDate() {
		return assemblyDate;
	}
	public void setAssemblyDate(LocalDateTime assemblyDate) {
		this.assemblyDate = assemblyDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardDto [assemblyIdx=");
		builder.append(assemblyIdx);
		builder.append(", creatorName=");
		builder.append(creatorName);
		builder.append(", assemblySort=");
		builder.append(assemblySort);
		builder.append(", assemblyName=");
		builder.append(assemblyName);
		builder.append(", ageArea=");
		builder.append(ageArea);
		builder.append(", smallGroup=");
		builder.append(smallGroup);
		builder.append(", significant=");
		builder.append(significant);
		builder.append(", attendanceMember=");
		builder.append(attendanceMember);
		builder.append(", attendanceCount=");
		builder.append(attendanceCount);
		builder.append(", assemblyDate=");
		builder.append(assemblyDate);
		builder.append(", type=");
		builder.append(type);
		builder.append(", keyword=");
		builder.append(keyword);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	

}
