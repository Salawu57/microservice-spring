package com.salawuBabatunde.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description="Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can nt be a null or empty")
    @Pattern(regexp="(^$|[0-9]{11})",message = "AccountNumber must be 11 digits")
    @Schema( description = "Account Number of Eazy account", example = "08038475847")
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be null or empty")
    @Schema(
         description = "Account type of Easy Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "Easy Bank branch address", example = "123 New York"
    )
    private String branchAddress;
}


