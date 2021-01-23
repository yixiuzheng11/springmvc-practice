package com.dto;

/**
 * 项目表 create time : 2019-12-26 18:52:57
 *
 */
public class ProjectDTO extends BaseDTO {

	/**
	 * 项目id
	 */
	private Long projectId;

    /**
     * 项目名称
     */
    private String projectName;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}