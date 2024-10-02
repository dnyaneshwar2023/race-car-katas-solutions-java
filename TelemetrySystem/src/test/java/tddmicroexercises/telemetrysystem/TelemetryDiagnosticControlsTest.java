package tddmicroexercises.telemetrysystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TelemetryDiagnosticControlsTest {

    private final TelemetryClient client = Mockito.mock(TelemetryClient.class);

    private TelemetryDiagnosticControls telemetryDiagnosticControls;

    @BeforeEach
    void setUp() {
        telemetryDiagnosticControls = new TelemetryDiagnosticControls(client);
    }

    @Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response() throws Exception {
        when(client.getOnlineStatus()).thenReturn(true);

        telemetryDiagnosticControls.checkTransmission();

        verify(client, times(1)).send(any());
    }

    @Test
    public void CheckTransmission_should_throw_exception_when_client_is_not_online() {
        when(client.getOnlineStatus()).thenReturn(false);

        Assertions.assertThrows(Exception.class, () -> telemetryDiagnosticControls.checkTransmission());
    }


}
