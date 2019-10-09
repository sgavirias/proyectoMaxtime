# language: es
@Clinica
Característica: registrar una solicutud medica a través del sistema de admin hospitales, se debe validar que haya doctor

  @RegistroDr
  Escenario: Realizar el Registro de un Doctor
    Dado que Carlos necesita registrar un nuevo doctor
    Cuando el realiza el registro del mismo en el aplicativo de Administración de Hospitales "001"
    Entonces el verifica que se presente en pantalla el mensaje Datos guardados correctamente

  @RegistroPaciente
  Escenario:Realizar el Registro de un Paciente
    Dado que Carlos necesita registrar un nuevo paciente
    Cuando  realiza el registro del mismo en el aplicativo de Administración de Hospitales
    Entonces  verifica que se presente en pantalla el mensaje Datos guardados correctamente

  @AgendaCita
  Escenario: Realizar el Agendamiento de una Cita
    Dado que Carlos necesita asistir al medico
    Cuando el realiza el agendamiento de una Cita
    Entonces el verifica que se presente en pantalla mensaje Datos guardados correctamente







