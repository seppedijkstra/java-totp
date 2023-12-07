package dev.totp.time;

import dev.totp.exceptions.TimeProviderException;

import java.time.Instant;

public class SystemTimeProvider implements TimeProvider {
    @Override
    public long getTime() throws TimeProviderException {
        return Instant.now().getEpochSecond();
    }
}
