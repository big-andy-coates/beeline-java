package io.honeycomb.beeline.tracing.ids;

import org.junit.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


public class UUIDTraceIdProviderTest {
    @Test
    public void checkThatValidUUIDsAreProduced() {
        final UUID uuid = UUID.fromString(new UUIDTraceIdProvider().generateId());

        assertThat(uuid).isNotNull();
    }
}
