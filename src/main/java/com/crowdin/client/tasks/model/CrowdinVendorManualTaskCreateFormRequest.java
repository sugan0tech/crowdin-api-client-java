package com.crowdin.client.tasks.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class CrowdinVendorManualTaskCreateFormRequest extends AddTaskRequest {

    private String title;
    private String languageId;
    private List<Long> fileIds;
    private Integer type;
    private String vendor;
    private Status status;
    private String description;
    private Boolean skipAssignedStrings;
    private Boolean skipUntranslatedStrings;
    private Boolean includePreTranslatedStringsOnly;
    private List<Long> labelIds;
    private List<AssigneeRequest> assignees;
    private Date deadline;
    private Date dateFrom;
    private Date dateTo;
}
