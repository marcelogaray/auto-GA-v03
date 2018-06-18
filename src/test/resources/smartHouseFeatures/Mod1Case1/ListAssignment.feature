Feature: Listar
  Background: El usuario ha sido logueado en el sistema
              Existe al menos una asignación realizada en el sistema
    Scenario: Listar asignaciones
      Given El usuario selecciona la opcion 'Asignacion de equipos'
      Then Se listan las asignaciones

