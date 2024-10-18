Benemérita Universidad Autónoma de Puebla

Facultad de Ciencias de la Computación

**Práctica 1. Aplicaciones Web**


**Docente:** ROBERTO ELVIRA ENRIQUEZ

18-10-2024

| **Presenta** | **Matrícula** |
| --- | --- |
| Erick de Jesús Molina | 202033682 |

|     |     |
| --- | --- |

# Introducción

En la actualidad la comunicación eficiente entre sistemas y aplicaciones se ha vuelto crucial. Los servicios web proporcionan una forma estándar para intercambiar información. Este proyecto se centra en la creación de un servicio web que expone su funcionalidad a través del protocolo SOAP utilizando netbeans 8.0. El servicio verifica la validez de un usuario y contraseña, almacenando la información correspondiente en una base de datos.

# Objetivo

Implementar un servicio web SOAP que valide credenciales de usuario (nombre de usuario y contraseña) y que sea capaz de interactuar con clientes en diferentes entornos, incluyendo una aplicación Java con interfaz gráfica (JSP) y una aplicación de escritorio en C# (WinForms). Además, se busca garantizar que toda la información relevante se preserve en una base de datos.

.

# Desarrollo

1. **Configuración del entorno de desarrollo:**
    - Instalación de NetBeans 8.0, Java 8 y Tomcat (en Windows).
    - Configuración de la base de datos (MariaDB proporcionada por XAMP y utilizando su driver oficial) para almacenar la información de usuarios.
2. **Creación del servicio web:**
    - Uso de anotaciones de JAX-WS para definir el servicio y sus métodos.
    - ![image](https://github.com/user-attachments/assets/72405f63-f863-4c59-81a3-bb3fdb717f08)

    - La validación se hace cotejando los datos almacenados en la base de datos, esta responsabilidad se delega a la capa de servicio, que a su vez hace uso de la capa de conexión a la base de datos.
    - ![image](https://github.com/user-attachments/assets/def24f5e-6749-4a37-b9fd-4d90fc7a8e09)


- - Exposición del servicio web a través de un WSDL que documente las operaciones disponibles.

1. **Desarrollo del cliente servlet en Java:**
    - Creación de un servlet que consuma el servicio web SOAP.
    - ![image](https://github.com/user-attachments/assets/21c112ee-d999-49d6-8f0c-d2e08b04abc3)

    - Implementación de una interfaz gráfica utilizando JSP para permitir a los usuarios ingresar sus credenciales
    - ![image](https://github.com/user-attachments/assets/8d2279f4-ffed-489d-bf32-c7a2166f4bca)
    - ![image](https://github.com/user-attachments/assets/74503872-9033-4390-bb0d-3f71a398b9e7)

.



1. **Desarrollo del cliente en C#:**
    - Creación de una aplicación WinForms que consuma el servicio web SOAP.
    - Implementación de los métodos necesarios para interactuar con el servicio y validar las credenciales del usuario.
    - ![image](https://github.com/user-attachments/assets/26f9197e-bdb9-4315-a208-895bd57e5fe3)
    - ![image](https://github.com/user-attachments/assets/0c949e21-3baf-4a0b-94ef-06a188b586d6)
    - ![image](https://github.com/user-attachments/assets/3f9f80fa-38ee-41ef-9d7b-422f2001b865)








1. **Pruebas y validación:**
    - Realización de pruebas para asegurar que el servicio web funcione correctamente y que los clientes puedan comunicarse con él de manera efectiva.
    - Verificación de que los datos se consulten correctamente en la base de datos.
    - ![image](https://github.com/user-attachments/assets/bea131e1-f8cd-421c-9a44-d4e2124a3f36)


Alcances y limitaciones

. **Alcances:**

- El servicio web podrá validar usuarios y contraseñas, y estará accesible para clientes en diferentes plataformas.
- La aplicación Java con JSP proporcionará una interfaz gráfica amigable para la interacción del usuario.
- El cliente en C# permitirá acceder a la funcionalidad del servicio desde una aplicación de escritorio.

**Limitaciones:**

- El servicio está limitado a la verificación de credenciales de usuario y no incluirá funcionalidades adicionales como recuperación de contraseñas o registro de nuevos usuarios.
- La implementación se basa en SOAP, lo que podría limitar la interoperabilidad con otros estándares modernos como REST.
- Dependencia de la infraestructura de Tomcat y la configuración de la base de datos.

Conclusión

Este proyecto ha permitido el desarrollo de un servicio web SOAP que valida credenciales de usuario, demostrando la viabilidad de la comunicación entre aplicaciones a través de diferentes plataformas. La implementación no solo facilita la autenticación de usuarios, sino que también establece un marco para futuras ampliaciones y mejoras del sistema. A medida que las necesidades de los usuarios evolucionan, se podrán integrar nuevas funcionalidades y tecnologías, asegurando que el sistema se mantenga relevante y eficiente.
