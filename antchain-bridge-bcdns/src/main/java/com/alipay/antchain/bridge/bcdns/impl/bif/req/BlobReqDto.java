package com.alipay.antchain.bridge.bcdns.impl.bif.req;

import lombok.Data;

@Data
public class BlobReqDto {

    private String txHash;

    private String blob;
}
