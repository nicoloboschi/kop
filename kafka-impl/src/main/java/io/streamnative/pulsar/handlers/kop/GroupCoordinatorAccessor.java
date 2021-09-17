package io.streamnative.pulsar.handlers.kop;

import io.streamnative.pulsar.handlers.kop.coordinator.group.GroupCoordinator;
import io.streamnative.pulsar.handlers.kop.coordinator.transaction.TransactionCoordinator;

public interface GroupCoordinatorAccessor {
    GroupCoordinator getGroupCoordinator(String tenant);
    TransactionCoordinator getTransactionCoordinator(String tenant);
}
