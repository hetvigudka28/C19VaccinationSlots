package com.example.vaccination;

import java.util.Objects;

public class CenterRvModal
{

    String centerName;
    String centerAddress;
    String centerFromTime;
    String centerToTime;
    String fee_type;
    int ageLimit;
    String vaccineName;
    int availableCapacity;

    public CenterRvModal(String centerName, String centerAddress, String centerFromTime, String centerToTime, String fee_type, int ageLimit, String vaccineName, int availableCapacity)
    {
        this.centerName=centerName;
        this.centerAddress=centerAddress;
        this.centerFromTime=centerFromTime;
        this.centerToTime=centerToTime;
        this.fee_type=fee_type;
        this.ageLimit=ageLimit;
        this.vaccineName=vaccineName;
        this.availableCapacity=availableCapacity;

    }


}
