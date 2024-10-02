# Solid Principles broken

Telemetry System:
1. IOC - telemetry client is directly instantiated inside the constructor so it's difficult to test and why should TelemetryDiagnosticControls class should take care
    about it's lifecycle
   - Fixed with adding constructor params for telemetry client
