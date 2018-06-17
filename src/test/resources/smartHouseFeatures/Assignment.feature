Feature: Asignacion de equipos
  Background: El usuario ha sido logueado en el sistema
              Existe al menos un empleado registrado en el sistema
              Existe al menos un equipo registrado en el sistema
  Scenario: Asignar un equipo a un empleado
    Given: Cuando el usuario selecciona la opcion 'Asignación de Equipos' y selecciona el boton 'Nueva Asignación'
    When: El usuario selecciona el empleado <"employee"> el equipo a ser asignado <"equipment"> y observaciones <"observaciones">
    And: El usuario presione click en el boton Crear
    Then: El usuario observa el mensaje "La asignación se registró correctamente"

