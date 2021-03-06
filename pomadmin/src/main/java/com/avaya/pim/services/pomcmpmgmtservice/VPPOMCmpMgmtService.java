package com.avaya.pim.services.pomcmpmgmtservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-14T11:15:56.246+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", name = "VP_POMCmpMgmtService")
@XmlSeeAlso({ObjectFactory.class})
public interface VPPOMCmpMgmtService {

    @WebMethod(operationName = "GetActiveJobTaskIds", action = "http://services.pim.avaya.com/CmpMgmt/GetActiveJobTaskIds")
    @RequestWrapper(localName = "GetActiveJobTaskIds", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobTaskIds")
    @ResponseWrapper(localName = "GetActiveJobTaskIdsResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobTaskIdsResponse")
    @WebResult(name = "JobAndTaskDetails", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<com.avaya.pim.services.pomcmpmgmtservice.JobIDAndTask> getActiveJobTaskIds(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName
    ) throws GetActiveJobTaskIdsFault;

    @WebMethod(operationName = "RunCampaign", action = "http://services.pim.avaya.com/CmpMgmt/RunCampaign")
    @RequestWrapper(localName = "RunCampaign", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.RunCampaign")
    @ResponseWrapper(localName = "RunCampaignResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.RunCampaignResponse")
    @WebResult(name = "IsQueued", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public boolean runCampaign(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName
    ) throws RunCampaignFault;

    @WebMethod(operationName = "ScheduleRecurringCampaign", action = "http://services.pim.avaya.com/CmpMgmt/ScheduleRecurringCampaign")
    @RequestWrapper(localName = "ScheduleRecurringCampaign", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaign")
    @ResponseWrapper(localName = "ScheduleRecurringCampaignResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringCampaignResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int scheduleRecurringCampaign(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName,
        @WebParam(name = "StartTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String startTime,
        @WebParam(name = "EndTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String endTime,
        @WebParam(name = "TimeZone", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String timeZone,
        @WebParam(name = "ScheduleFrequency", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        com.avaya.pim.services.pomcmpmgmtservice.RecurringFrequencyType scheduleFrequency,
        @WebParam(name = "WeekDaysOnly", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.Boolean weekDaysOnly,
        @WebParam(name = "SelectedDays", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.util.List<java.lang.String> selectedDays,
        @WebParam(name = "RunEveryMinutes", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String runEveryMinutes,
        @WebParam(name = "ArchivalScheduleFrequency", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        com.avaya.pim.services.pomcmpmgmtservice.ArchivalFrequencyType archivalScheduleFrequency,
        @WebParam(name = "ArchivalInNHours", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String archivalInNHours,
        @WebParam(name = "ArchivalTimeInHrsMins", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String archivalTimeInHrsMins
    ) throws ScheduleRecurringCampaignFault;

    @WebMethod(operationName = "ScheduleRecurringDataSource", action = "http://services.pim.avaya.com/CmpMgmt/ScheduleRecurringDataSource")
    @RequestWrapper(localName = "ScheduleRecurringDataSource", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringDataSource")
    @ResponseWrapper(localName = "ScheduleRecurringDataSourceResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleRecurringDataSourceResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int scheduleRecurringDataSource(
        @WebParam(name = "DataSourceName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String dataSourceName,
        @WebParam(name = "StartTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String startTime,
        @WebParam(name = "EndTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String endTime,
        @WebParam(name = "TimeZone", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String timeZone,
        @WebParam(name = "ScheduleFrequency", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String scheduleFrequency,
        @WebParam(name = "WeekDaysOnly", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.Boolean weekDaysOnly,
        @WebParam(name = "SelectedDays", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.util.List<java.lang.String> selectedDays,
        @WebParam(name = "RunEveryMinutes", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String runEveryMinutes
    ) throws ScheduleRecurringDataSourceFault;

    @WebMethod(operationName = "GetContactListNames", action = "http://services.pim.avaya.com/CmpMgmt/GetContactListNames")
    @RequestWrapper(localName = "GetContactListNames", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetContactListNames")
    @ResponseWrapper(localName = "GetContactListNamesResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetContactListNamesResponse")
    @WebResult(name = "ListNames", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<java.lang.String> getContactListNames(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName
    ) throws GetContactListNamesFault;

    @WebMethod(operationName = "GetActiveJobTaskIdForTask", action = "http://services.pim.avaya.com/CmpMgmt/GetActiveJobTaskIdForTask")
    @RequestWrapper(localName = "GetActiveJobTaskIdForTask", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobTaskIdForTask")
    @ResponseWrapper(localName = "GetActiveJobTaskIdForTaskResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobTaskIdForTaskResponse")
    @WebResult(name = "ActiveJobsAndTaskDetails", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<com.avaya.pim.services.pomcmpmgmtservice.JobIDAndTask> getActiveJobTaskIdForTask(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName,
        @WebParam(name = "TaskName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String taskName
    ) throws GetActiveJobTaskIdForTaskFault;

    @WebMethod(operationName = "ResumePausedJob", action = "http://services.pim.avaya.com/CmpMgmt/ResumePausedJob")
    @RequestWrapper(localName = "ResumePausedJob", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJob")
    @ResponseWrapper(localName = "ResumePausedJobResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ResumePausedJobResponse")
    @WebResult(name = "IsResumed", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public boolean resumePausedJob(
        @WebParam(name = "JobID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int jobID
    ) throws ResumePausedJobFault;

    @WebMethod(operationName = "ScheduleDataSource", action = "http://services.pim.avaya.com/CmpMgmt/ScheduleDataSource")
    @RequestWrapper(localName = "ScheduleDataSource", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleDataSource")
    @ResponseWrapper(localName = "ScheduleDataSourceResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleDataSourceResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int scheduleDataSource(
        @WebParam(name = "DataSourceName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String dataSourceName,
        @WebParam(name = "StartTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String startTime,
        @WebParam(name = "TimeZone", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String timeZone
    ) throws ScheduleDataSourceFault;

    @WebMethod(operationName = "GetCampaignJobs", action = "http://services.pim.avaya.com/CmpMgmt/GetCampaignJobs")
    @RequestWrapper(localName = "GetCampaignJobs", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetCampaignJobs")
    @ResponseWrapper(localName = "GetCampaignJobsResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetCampaignJobsResponse")
    @WebResult(name = "JobDetails", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<com.avaya.pim.services.pomcmpmgmtservice.JobIDsAndStates> getCampaignJobs(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName,
        @WebParam(name = "JobState", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.util.List<java.lang.String> jobState
    ) throws GetCampaignJobsFault;

    @WebMethod(operationName = "GetCampaignDetails", action = "http://services.pim.avaya.com/CmpMgmt/GetCampaignDetails")
    @RequestWrapper(localName = "GetCampaignDetails", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetCampaignDetails")
    @ResponseWrapper(localName = "GetCampaignDetailsResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetCampaignDetailsResponse")
    @WebResult(name = "CampaignDetails", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<com.avaya.pim.services.pomcmpmgmtservice.CampaignNameJobIDsAndStates> getCampaignDetails(
        @WebParam(name = "JobState", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.util.List<java.lang.String> jobState
    ) throws GetCampaignDetailsFault;

    @WebMethod(operationName = "SetMaxAttemptsCount", action = "http://services.pim.avaya.com/CmpMgmt/SetMaxAttemptsCount")
    @RequestWrapper(localName = "SetMaxAttemptsCount", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCount")
    @ResponseWrapper(localName = "SetMaxAttemptsCountResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int setMaxAttemptsCount(
        @WebParam(name = "JobID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int jobID,
        @WebParam(name = "Count", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int count
    ) throws SetMaxAttemptsCountFault;

    @WebMethod(operationName = "SetMaxAttemptsCountForTask", action = "http://services.pim.avaya.com/CmpMgmt/SetMaxAttemptsCountForTask")
    @RequestWrapper(localName = "SetMaxAttemptsCountForTask", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountForTask")
    @ResponseWrapper(localName = "SetMaxAttemptsCountForTaskResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.SetMaxAttemptsCountForTaskResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int setMaxAttemptsCountForTask(
        @WebParam(name = "JobID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int jobID,
        @WebParam(name = "TaskID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int taskID,
        @WebParam(name = "Count", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int count
    ) throws SetMaxAttemptsCountForTaskFault;

    @WebMethod(operationName = "GetActiveJobs", action = "http://services.pim.avaya.com/CmpMgmt/GetActiveJobs")
    @RequestWrapper(localName = "GetActiveJobs", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobs")
    @ResponseWrapper(localName = "GetActiveJobsResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetActiveJobsResponse")
    @WebResult(name = "Jobs", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<java.lang.Integer> getActiveJobs(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName
    ) throws GetActiveJobsFault;

    @WebMethod(operationName = "PauseActiveJob", action = "http://services.pim.avaya.com/CmpMgmt/PauseActiveJob")
    @RequestWrapper(localName = "PauseActiveJob", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.PauseActiveJob")
    @ResponseWrapper(localName = "PauseActiveJobResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.PauseActiveJobResponse")
    @WebResult(name = "IsPaused", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public boolean pauseActiveJob(
        @WebParam(name = "JobID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int jobID
    ) throws PauseActiveJobFault;

    @WebMethod(operationName = "StopJob", action = "http://services.pim.avaya.com/CmpMgmt/StopJob")
    @RequestWrapper(localName = "StopJob", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.StopJob")
    @ResponseWrapper(localName = "StopJobResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.StopJobResponse")
    @WebResult(name = "IsStopped", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public boolean stopJob(
        @WebParam(name = "JobID", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        int jobID
    ) throws StopJobFault;

    @WebMethod(operationName = "GetImportJobStatus", action = "http://services.pim.avaya.com/CmpMgmt/GetImportJobStatus")
    @RequestWrapper(localName = "GetImportJobStatus", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetImportJobStatus")
    @ResponseWrapper(localName = "GetImportJobStatusResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.GetImportJobStatusResponse")
    @WebResult(name = "ImportJobs", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public java.util.List<com.avaya.pim.services.pomcmpmgmtservice.ImportJobStatus> getImportJobStatus(
        @WebParam(name = "DataSourceName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String dataSourceName,
        @WebParam(name = "JobStates", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.util.List<com.avaya.pim.services.pomcmpmgmtservice.ImportJobState> jobStates
    ) throws GetImportJobStatusFault;

    @WebMethod(operationName = "ScheduleCampaign", action = "http://services.pim.avaya.com/CmpMgmt/ScheduleCampaign")
    @RequestWrapper(localName = "ScheduleCampaign", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleCampaign")
    @ResponseWrapper(localName = "ScheduleCampaignResponse", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/", className = "com.avaya.pim.services.pomcmpmgmtservice.ScheduleCampaignResponse")
    @WebResult(name = "Result", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
    public int scheduleCampaign(
        @WebParam(name = "CampaignName", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String campaignName,
        @WebParam(name = "StartTime", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String startTime,
        @WebParam(name = "TimeZone", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String timeZone,
        @WebParam(name = "ArchivalScheduleFrequency", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        com.avaya.pim.services.pomcmpmgmtservice.ArchivalFrequencyType archivalScheduleFrequency,
        @WebParam(name = "ArchivalTimeInHrsMins", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String archivalTimeInHrsMins,
        @WebParam(name = "ArchivalInNHours", targetNamespace = "http://services.pim.avaya.com/CmpMgmt/")
        java.lang.String archivalInNHours
    ) throws ScheduleCampaignFault;
}
