package info.nightscout.androidaps.danars.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.androidaps.danars.comm.*

@Module
@Suppress("unused")
abstract class DanaRSCommModule {

    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet(): DanaRS_Packet
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Cancel_Temporary_Basal(): DanaRS_Packet_Basal_Set_Cancel_Temporary_Basal
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Get_Basal_Rate(): DanaRS_Packet_Basal_Get_Basal_Rate
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Get_Profile_Basal_Rate(): DanaRS_Packet_Basal_Get_Profile_Basal_Rate
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Get_Profile_Number(): DanaRS_Packet_Basal_Get_Profile_Number
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Basal_Rate(): DanaRS_Packet_Basal_Set_Basal_Rate
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Profile_Basal_Rate(): DanaRS_Packet_Basal_Set_Profile_Basal_Rate
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Profile_Number(): DanaRS_Packet_Basal_Set_Profile_Number
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Suspend_Off(): DanaRS_Packet_Basal_Set_Suspend_Off
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Suspend_On(): DanaRS_Packet_Basal_Set_Suspend_On
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Set_Temporary_Basal(): DanaRS_Packet_Basal_Set_Temporary_Basal
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Basal_Get_Temporary_Basal_State(): DanaRS_Packet_Basal_Get_Temporary_Basal_State
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Bolus_Option(): DanaRS_Packet_Bolus_Get_Bolus_Option
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Initial_Bolus(): DanaRS_Packet_Bolus_Get_Initial_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Calculation_Information(): DanaRS_Packet_Bolus_Get_Calculation_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Carbohydrate_Calculation_Information(): DanaRS_Packet_Bolus_Get_Carbohydrate_Calculation_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_CIR_CF_Array(): DanaRS_Packet_Bolus_Get_CIR_CF_Array
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_24_CIR_CF_Array(): DanaRS_Packet_Bolus_Get_24_CIR_CF_Array
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Dual_Bolus(): DanaRS_Packet_Bolus_Get_Dual_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Extended_Bolus(): DanaRS_Packet_Bolus_Get_Extended_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Extended_Bolus_State(): DanaRS_Packet_Bolus_Get_Extended_Bolus_State
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Extended_Menu_Option_State(): DanaRS_Packet_Bolus_Get_Extended_Menu_Option_State
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Get_Step_Bolus_Information(): DanaRS_Packet_Bolus_Get_Step_Bolus_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Bolus_Option(): DanaRS_Packet_Bolus_Set_Bolus_Option
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Initial_Bolus(): DanaRS_Packet_Bolus_Set_Initial_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_CIR_CF_Array(): DanaRS_Packet_Bolus_Set_CIR_CF_Array
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_24_CIR_CF_Array(): DanaRS_Packet_Bolus_Set_24_CIR_CF_Array
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Dual_Bolus(): DanaRS_Packet_Bolus_Set_Dual_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Extended_Bolus(): DanaRS_Packet_Bolus_Set_Extended_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Extended_Bolus_Cancel(): DanaRS_Packet_Bolus_Set_Extended_Bolus_Cancel
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Step_Bolus_Start(): DanaRS_Packet_Bolus_Set_Step_Bolus_Start
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Bolus_Set_Step_Bolus_Stop(): DanaRS_Packet_Bolus_Set_Step_Bolus_Stop
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Etc_Keep_Connection(): DanaRS_Packet_Etc_Keep_Connection
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Etc_Set_History_Save(): DanaRS_Packet_Etc_Set_History_Save
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Delivery_Status(): DanaRS_Packet_General_Delivery_Status
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_Password(): DanaRS_Packet_General_Get_Password
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Initial_Screen_Information(): DanaRS_Packet_General_Initial_Screen_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Notify_Alarm(): DanaRS_Packet_Notify_Alarm
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Notify_Delivery_Complete(): DanaRS_Packet_Notify_Delivery_Complete
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Notify_Delivery_Rate_Display(): DanaRS_Packet_Notify_Delivery_Rate_Display
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Notify_Missed_Bolus_Alarm(): DanaRS_Packet_Notify_Missed_Bolus_Alarm
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Get_Pump_Time(): DanaRS_Packet_Option_Get_Pump_Time
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Get_User_Option(): DanaRS_Packet_Option_Get_User_Option
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Set_Pump_Time(): DanaRS_Packet_Option_Set_Pump_Time
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Set_User_Option(): DanaRS_Packet_Option_Set_User_Option
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_(): DanaRS_Packet_History_
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Alarm(): DanaRS_Packet_History_Alarm
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_All_History(): DanaRS_Packet_History_All_History
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Basal(): DanaRS_Packet_History_Basal
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Blood_Glucose(): DanaRS_Packet_History_Blood_Glucose
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Bolus(): DanaRS_Packet_History_Bolus
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Review_Bolus_Avg(): DanaRS_Packet_Review_Bolus_Avg
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Carbohydrate(): DanaRS_Packet_History_Carbohydrate
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Daily(): DanaRS_Packet_History_Daily
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_More_Information(): DanaRS_Packet_General_Get_More_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_Pump_Check(): DanaRS_Packet_General_Get_Pump_Check
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_Shipping_Information(): DanaRS_Packet_General_Get_Shipping_Information
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_Today_Delivery_Total(): DanaRS_Packet_General_Get_Today_Delivery_Total
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_User_Time_Change_Flag(): DanaRS_Packet_General_Get_User_Time_Change_Flag
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Prime(): DanaRS_Packet_History_Prime
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Refill(): DanaRS_Packet_History_Refill
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Set_History_Upload_Mode(): DanaRS_Packet_General_Set_History_Upload_Mode
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Set_User_Time_Change_Flag_Clear(): DanaRS_Packet_General_Set_User_Time_Change_Flag_Clear
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Suspend(): DanaRS_Packet_History_Suspend
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_History_Temporary(): DanaRS_Packet_History_Temporary
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_APS_Basal_Set_Temporary_Basal(): DanaRS_Packet_APS_Basal_Set_Temporary_Basal
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_APS_History_Events(): DanaRS_Packet_APS_History_Events
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_APS_Set_Event_History(): DanaRS_Packet_APS_Set_Event_History
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_General_Get_Shipping_Version(): DanaRS_Packet_General_Get_Shipping_Version
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Review_Get_Pump_Dec_Ratio(): DanaRS_Packet_Review_Get_Pump_Dec_Ratio
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Get_Pump_UTC_And_TimeZone(): DanaRS_Packet_Option_Get_Pump_UTC_And_TimeZone
    @ContributesAndroidInjector abstract fun contributesDanaRS_Packet_Option_Set_Pump_UTC_And_TimeZone(): DanaRS_Packet_Option_Set_Pump_UTC_And_TimeZone
}