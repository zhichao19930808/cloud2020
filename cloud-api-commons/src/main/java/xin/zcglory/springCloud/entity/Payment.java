package xin.zcglory.springCloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment implements Serializable {
    private long id;
    private String policyNo;
}
