package io.axoniq.demo.sqwebinar.commandside;

import lombok.Value;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class IssueCommand {

    @TargetAggregateIdentifier
    String id;
    BigDecimal amount;

}
