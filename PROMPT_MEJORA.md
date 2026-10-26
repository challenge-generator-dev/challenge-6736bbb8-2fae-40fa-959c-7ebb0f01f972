# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/com/fintech/payments/infrastructure/config/SecurityConfig.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/fintech/payments/infrastructure/security/JwtTokenUtil.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/fintech/payments/infrastructure/security/JwtAuthenticationFilter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/fintech/payments/application/service/AuthService.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/fintech/payments/infrastructure/controller/AuthController.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/test/java/com/fintech/payments/infrastructure/security/JwtTokenUtilTest.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/test/java/com/fintech/payments/infrastructure/security/JwtAuthenticationFilterTest.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/fintech/payments/infrastructure/config/OpenApiConfig.java` — `io.swagger.v3`: El import io.swagger.v3.oas.models.Components pertenece a io.swagger.v3, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).
- `src/main/java/com/fintech/payments/domain/model/User.java` — `Role.getRoleName`: Se invoca `getRoleName` sobre `Role`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/domain/model/User.java` — `Role.getPermissions`: Se invoca `getPermissions` sobre `Role`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getId`: Se invoca `getId` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setCreatedAt`: Se invoca `setCreatedAt` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setUpdatedAt`: Se invoca `setUpdatedAt` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.isPresent`: Se invoca `isPresent` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.get`: Se invoca `get` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `RoleMapper.toEntityRoles`: Se invoca `toEntityRoles` sobre `RoleMapper`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setId`: Se invoca `setId` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setUsername`: Se invoca `setUsername` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getUsername`: Se invoca `getUsername` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setEmail`: Se invoca `setEmail` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getEmail`: Se invoca `getEmail` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setPassword`: Se invoca `setPassword` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getPassword`: Se invoca `getPassword` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setEnabled`: Se invoca `setEnabled` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.isEnabled`: Se invoca `isEnabled` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getCreatedAt`: Se invoca `getCreatedAt` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getUpdatedAt`: Se invoca `getUpdatedAt` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.setRoles`: Se invoca `setRoles` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.getRoles`: Se invoca `getRoles` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setId`: Se invoca `setId` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getId`: Se invoca `getId` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setUsername`: Se invoca `setUsername` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getUsername`: Se invoca `getUsername` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setEmail`: Se invoca `setEmail` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getEmail`: Se invoca `getEmail` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setPassword`: Se invoca `setPassword` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getPassword`: Se invoca `getPassword` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setEnabled`: Se invoca `setEnabled` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.isEnabled`: Se invoca `isEnabled` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setCreatedAt`: Se invoca `setCreatedAt` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getCreatedAt`: Se invoca `getCreatedAt` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setUpdatedAt`: Se invoca `setUpdatedAt` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getUpdatedAt`: Se invoca `getUpdatedAt` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `User.setRoles`: Se invoca `setRoles` sobre `User`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `RoleMapper.toDomainRoles`: Se invoca `toDomainRoles` sobre `RoleMapper`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java` — `UserEntity.getRoles`: Se invoca `getRoles` sobre `UserEntity`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced

### Brecha de conocimiento
Experto en el marco de trabajo (framework) más relevante en su lenguaje de programación principal, lo que le permite escribir código más legible y reducir la redundancia. Ha implementado al menos dos mecanismos de autenticación e identifica el uso de un JWT

### Misión / candidato
Candidato con experiencia avanzada en Backend, trabajando en equipos distribuidos.

### Reto
- Tema: Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código
- Seniority: advanced-l2
- Tipo: practical
- Título: Mejora de Seguridad y Legibilidad en Aplicación de Pagos
- Tiempo estimado: 3h30m

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Diagnóstico de la Aplicación Actual — objetivo: Identificar puntos de mejora en la autenticación y configuración de la aplicación. — entregable (NO resolver): Reporte de diagnóstico con puntos de mejora identificados.
- Fase 2: Implementación de Mecanismos de Autenticación — objetivo: Implementar dos mecanismos de autenticación utilizando el framework. — entregable (NO resolver): Aplicación con dos mecanismos de autenticación implementados.
- Fase 3: Centralización de la Configuración — objetivo: Centralizar la configuración de la aplicación para mejorar la legibilidad del código. — entregable (NO resolver): Aplicación con configuración centralizada.
- Fase 4: Revisión y Mejora Continua — objetivo: Revisar el trabajo realizado y proponer mejoras continuas. — entregable (NO resolver): Aplicación mejorada con propuestas de mejora implementadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/>
    </parent>

    <groupId>com.fintech</groupId>
    <artifactId>payments</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>payments</name>
    <description>Fintech Payments Application</description>

    <properties>
        <java.version>21</java.version>
        <springdoc-openapi-ui.version>2.5.0</springdoc-openapi-ui.version>
        <jjwt.version>0.11.5</jjwt.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <!-- JWT -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>${jjwt.version}</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>

        <!-- Database -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>

        <!-- Lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <scope>provided</scope>
        </dependency>

        <!-- OpenAPI/Swagger -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>${springdoc-openapi-ui.version}</version>
        </dependency>

        <!-- Test -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/com/fintech/payments/Application.java ===
package com.fintech.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: payments
  datasource:
    url: jdbc:postgresql://localhost:5432/payments_db
    username: payments_user
    password: payments_password
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect

server:
  port: 8080
  servlet:
    context-path: /api

logging:
  level:
    root: INFO
    com.fintech.payments: DEBUG
    org.springframework.security: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE

security:
  jwt:
    secret: ${JWT_SECRET:defaultSecretKeyForDevelopmentOnly1234567890}
    expiration: 86400000 # 24 hours in milliseconds
  oauth2:
    resourceserver:
      jwt:
        issuer-uri: ${OAUTH2_ISSUER_URI:http://localhost:8080/auth/realms/fintech}
        jwk-set-uri: ${OAUTH2_JWK_SET_URI:http://localhost:8080/auth/realms/fintech/protocol/openid-connect/certs}

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
  endpoint:
    health:
      show-details: always

springdoc:
  api-docs:
    path: /v3/api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method
    tagsSorter: alpha
    docExpansion: none

// === ARCHIVO: src/main/java/com/fintech/payments/domain/model/User.java ===
package com.fintech.payments.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.HashSet;

/**
 * Entidad de dominio que representa un usuario del sistema.
 * Contiene información básica del usuario, sus roles y permisos, y metadatos de auditoría.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private UUID id;

    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    @Size(min = 3, max = 50, message = "El nombre de usuario debe tener entre 3 y 50 caracteres")
    private String username;

    @NotBlank(message = "El email no puede estar vacío")
    @Email(message = "El email debe ser válido")
    private String email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    private boolean enabled;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder.Default
    private Set<Role> roles = new HashSet<>();

    /**
     * Enum que representa los roles disponibles en el sistema.
     * Cada rol tiene un conjunto de permisos asociados.
     */
    public enum Role {
        USER("USER", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS")),
        ADMIN("ADMIN", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS", "UPDATE_TRANSACTIONS", "DELETE_TRANSACTIONS", "MANAGE_USERS")),
        MERCHANT("MERCHANT", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS", "READ_REPORTS"));

        private final String roleName;
        private final Set<String> permissions;

        Role(String roleName, Set<String> permissions) {
            this.roleName = roleName;
            this.permissions = permissions;
        }

        public String getRoleName() {
            return roleName;
        }

        public Set<String> getPermissions() {
            return permissions;
        }

        public static Role fromRoleName(String roleName) {
            for (Role role : Role.values()) {
                if (role.getRoleName().equalsIgnoreCase(roleName)) {
                    return role;
                }
            }
            throw new IllegalArgumentException("Rol no válido: " + roleName);
        }
    }

    /**
     * Verifica si el usuario tiene un rol específico.
     * @param roleName Nombre del rol a verificar.
     * @return true si el usuario tiene el rol, false en caso contrario.
     */
    public boolean hasRole(String roleName) {
        return roles.stream().anyMatch(role -> role.getRoleName().equalsIgnoreCase(roleName));
    }

    /**
     * Verifica si el usuario tiene un permiso específico.
     * @param permission Permiso a verificar.
     * @return true si el usuario tiene el permiso, false en caso contrario.
     */
    public boolean hasPermission(String permission) {
        return roles.stream()
                .flatMap(role -> role.getPermissions().stream())
                .anyMatch(p -> p.equalsIgnoreCase(permission));
    }

    /**
     * Actualiza los metadatos de auditoría del usuario.
     */
    public void updateAuditMetadata() {
        this.updatedAt = LocalDateTime.now();
        if (this.createdAt == null) {
            this.createdAt = this.updatedAt;
        }
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/domain/port/UserRepository.java ===
package com.fintech.payments.domain.port;


import com.fintech.payments.domain.model.Role;
import com.fintech.payments.domain.model.User;
import java.util.Optional;
import java.util.UUID;
import java.util.List;

/**
 * Puerto de repositorio para operaciones de persistencia de usuarios.
 * Define las operaciones que el dominio necesita para interactuar con la capa de infraestructura.
 */
public interface UserRepository {
    /**
     * Guarda un usuario en el repositorio.
     * @param user Usuario a guardar.
     * @return Usuario guardado con su ID generado.
     */
    User save(User user);

    /**
     * Busca un usuario por su ID.
     * @param id ID del usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findById(UUID id);

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username Nombre de usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findByUsername(String username);

    /**
     * Busca un usuario por su email.
     * @param email Email del usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findByEmail(String email);

    /**
     * Verifica si existe un usuario con el email proporcionado.
     * @param email Email a verificar.
     * @return true si existe, false en caso contrario.
     */
    boolean existsByEmail(String email);

    /**
     * Verifica si existe un usuario con el nombre de usuario proporcionado.
     * @param username Nombre de usuario a verificar.
     * @return true si existe, false en caso contrario.
     */
    boolean existsByUsername(String username);

    /**
     * Elimina un usuario por su ID.
     * @param id ID del usuario a eliminar.
     */
    void deleteById(UUID id);

    /**
     * Obtiene todos los usuarios del sistema.
     * @return Lista de todos los usuarios.
     */
    List<User> findAll();

    /**
     * Actualiza la contraseña de un usuario.
     * @param userId ID del usuario.
     * @param newPassword Nueva contraseña.
     * @return true si la actualización fue exitosa, false en caso contrario.
     */
    boolean updatePassword(UUID userId, String newPassword);

    /**
     * Actualiza los roles de un usuario.
     * @param userId ID del usuario.
     * @param roles Nuevos roles del usuario.
     * @return true si la actualización fue exitosa, false en caso contrario.
     */
    boolean updateRoles(UUID userId, Set<User.Role> roles);
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/config/SecurityConfig.java ===
package com.fintech.payments.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**", "/actuator/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                .anyRequest().authenticated());
        return http.build();
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/security/JwtTokenUtil.java ===
package com.fintech.payments.infrastructure.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {

    private static final String SECRET_KEY = "payments-app-secret-key-for-jwt-token-generation-must-be-long-enough";
    private static final long EXPIRATION_TIME = 86400000;

    private final SecretKey key;

    public JwtTokenUtil() {
        this.key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
    }

    public String generateToken(String username, Map<String, Object> claims) {
        Map<String, Object> tokenClaims = new HashMap<>(claims);
        return Jwts.builder()
                .setClaims(tokenClaims)
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    public Date extractExpiration(String token) {
        return extractAllClaims(token).getExpiration();
    }

    public boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public boolean validateToken(String token, String username) {
        return (extractUsername(token).equals(username) && !isTokenExpired(token));
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/security/JwtAuthenticationFilter.java ===
package com.fintech.payments.infrastructure.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenUtil jwtTokenUtil;

    public JwtAuthenticationFilter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        String authHeader = request.getHeader("Authorization");
        
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            
            try {
                String username = jwtTokenUtil.extractUsername(token);
                
                if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                    if (jwtTokenUtil.validateToken(token, username)) {
                        List<SimpleGrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_USER"));
                        
                        UsernamePasswordAuthenticationToken authentication =
                                new UsernamePasswordAuthenticationToken(username, null, authorities);
                        
                        SecurityContextHolder.getContext().setAuthentication(authentication);
                    }
                }
            } catch (Exception e) {
                logger.error("Error validating JWT token: " + e.getMessage());
            }
        }
        
        filterChain.doFilter(request, response);
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/adapter/UserRepositoryAdapter.java ===
package com.fintech.payments.infrastructure.adapter;

import com.fintech.payments.domain.model.User;
import com.fintech.payments.domain.port.UserRepository;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository jpaRepository;
    private final RoleMapper roleMapper;

    public UserRepositoryAdapter(UserJpaRepository jpaRepository, RoleMapper roleMapper) {
        this.jpaRepository = jpaRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public User save(User user) {
        UserEntity entity = toEntity(user);
        if (user.getId() == null) {
            entity.setCreatedAt(LocalDateTime.now());
        }
        entity.setUpdatedAt(LocalDateTime.now());
        UserEntity saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return jpaRepository.findByUsername(username).map(this::toDomain);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaRepository.findByEmail(email).map(this::toDomain);
    }

    @Override
    public boolean existsByEmail(String email) {
        return jpaRepository.existsByEmail(email);
    }

    @Override
    public boolean existsByUsername(String username) {
        return jpaRepository.existsByUsername(username);
    }

    @Override
    public void deleteById(UUID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public boolean updatePassword(UUID userId, String newPassword) {
        Optional<UserEntity> entity = jpaRepository.findById(userId);
        if (entity.isPresent()) {
            entity.get().setPassword(newPassword);
            entity.get().setUpdatedAt(LocalDateTime.now());
            jpaRepository.save(entity.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRoles(UUID userId, Set<User.Role> roles) {
        Optional<UserEntity> entity = jpaRepository.findById(userId);
        if (entity.isPresent()) {
            entity.get().setRoles(roleMapper.toEntityRoles(roles));
            entity.get().setUpdatedAt(LocalDateTime.now());
            jpaRepository.save(entity.get());
            return true;
        }
        return false;
    }

    private UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        if (user.getId() != null) {
            entity.setId(user.getId());
        }
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setEnabled(user.isEnabled());
        entity.setCreatedAt(user.getCreatedAt());
        entity.setUpdatedAt(user.getUpdatedAt());
        entity.setRoles(roleMapper.toEntityRoles(user.getRoles()));
        return entity;
    }

    private User toDomain(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setUsername(entity.getUsername());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setEnabled(entity.isEnabled());
        user.setCreatedAt(entity.getCreatedAt());
        user.setUpdatedAt(entity.getUpdatedAt());
        user.setRoles(roleMapper.toDomainRoles(entity.getRoles()));
        return user;
    }

    @Entity
    @Table(name = "users")
    public static class UserEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;

        @Column(unique = true, nullable = false)
        private String username;

        @Column(unique = true, nullable = false)
        private String email;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private boolean enabled;

        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        @ElementCollection(fetch = FetchType.EAGER)
        @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
        @Enumerated(EnumType.STRING)
        @Column(name = "role")
        private Set<Role> roles = new HashSet<>();

        public UUID getId() { return id; }
        public void setId(UUID id) { this.id = id; }
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public boolean isEnabled() { return enabled; }
        public void setEnabled(boolean enabled) { this.enabled = enabled; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
        public LocalDateTime getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
        public Set<Role> getRoles() { return roles; }
        public void setRoles(Set<Role> roles) { this.roles = roles; }
    }

    public enum Role {
        ADMIN, USER, OPERATOR, AUDITOR
    }

    public static class RoleMapper {
        public Set<Role> toEntityRoles(Set<User.Role> domainRoles) {
            if (domainRoles == null) return new HashSet<>();
            return domainRoles.stream()
                    .map(r -> Role.valueOf(r.name()))
                    .collect(Collectors.toSet());
        }

        public Set<User.Role> toDomainRoles(Set<Role> entityRoles) {
            if (entityRoles == null) return new HashSet<>();
            return entityRoles.stream()
                    .map(r -> User.Role.valueOf(r.name()))
                    .collect(Collectors.toSet());
        }
    }

    public interface UserJpaRepository {
        UserEntity save(UserEntity entity);
        Optional<UserEntity> findById(UUID id);
        Optional<UserEntity> findByUsername(String username);
        Optional<UserEntity> findByEmail(String email);
        boolean existsByEmail(String email);
        boolean existsByUsername(String username);
        void deleteById(UUID id);
        List<UserEntity> findAll();
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/application/service/AuthService.java ===
package com.fintech.payments.application.service;


import com.fintech.payments.domain.model.Role;
import com.fintech.payments.domain.model.User;
import com.fintech.payments.domain.port.UserRepository;

import java.util.Set;
import java.util.UUID;

public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación con JWT");
    }

    public String generateToken(User user) {
        throw new UnsupportedOperationException("Implementar generación de token JWT");
    }

    public boolean validateToken(String token) {
        throw new UnsupportedOperationException("Implementar validación de token JWT");
    }

    public User registerUser(String username, String email, String password, Set<User.Role> roles) {
        throw new UnsupportedOperationException("Implementar registro de usuario");
    }

    public boolean changePassword(UUID userId, String oldPassword, String newPassword) {
        throw new UnsupportedOperationException("Implementar cambio de contraseña");
    }

    public boolean resetPassword(String email) {
        throw new UnsupportedOperationException("Implementar reset de contraseña");
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/controller/AuthController.java ===
package com.fintech.payments.infrastructure.controller;

import com.fintech.payments.application.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        throw new UnsupportedOperationException("Implementar endpoint de login");
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        throw new UnsupportedOperationException("Implementar endpoint de registro");
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar refresh de token");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar logout");
    }

    @PostMapping("/password/change")
    public ResponseEntity<?> changePassword(
            @RequestHeader("Authorization") String authHeader,
            @RequestBody ChangePasswordRequest request) {
        throw new UnsupportedOperationException("Implementar cambio de contraseña");
    }

    @PostMapping("/password/reset")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest request) {
        throw new UnsupportedOperationException("Implementar reset de contraseña");
    }

    @GetMapping("/me")
    public ResponseEntity<?> me(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar endpoint de información de usuario");
    }

    public record LoginRequest(String username, String password) {}
    public record RegisterRequest(String username, String email, String password, Set<String> roles) {}
    public record ChangePasswordRequest(String oldPassword, String newPassword) {}
    public record ResetPasswordRequest(String email) {}
}

// === ARCHIVO: src/main/java/com/fintech/payments/infrastructure/config/OpenApiConfig.java ===
package com.fintech.payments.infrastructure.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración centralizada de OpenAPI/Swagger para documentación de la API.
 * Define la información de la API, esquemas de seguridad y personalización visual.
 */
@Configuration
public class OpenApiConfig {

    private static final String API_TITLE = "Fintech Payments API";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "API REST para la gestión de pagos y transacciones financieras. "
            + "Proporciona endpoints seguros para autenticación, gestión de usuarios y procesamiento de pagos. "
            + "Requiere autenticación JWT Bearer para acceder a los endpoints protegidos.";
    private static final String SCHEME_NAME = "Bearer Authentication";
    private static final String SCHEME_DESCRIPTION = "JWT Bearer Token authentication. "
            + "Obtener el token mediante el endpoint POST /api/v1/auth/login";

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_TITLE)
                        .version(API_VERSION)
                        .description(API_DESCRIPTION)
                        .contact(new Contact()
                                .name("Fintech Payments Team")
                                .email("support@fintech-payments.com")
                                .url("https://www.fintech-payments.com"))
                        .license(new License()
                                .name("Proprietary")
                                .url("https://www.fintech-payments.com/legal")))
                .addSecurityItem(new SecurityRequirement().addList(SCHEME_NAME))
                .components(new Components()
                        .addSecuritySchemes(SCHEME_NAME,
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description(SCHEME_DESCRIPTION)));
    }
}

// === ARCHIVO: src/test/java/com/fintech/payments/infrastructure/security/JwtTokenUtilTest.java ===
package com.fintech.payments.infrastructure.security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Superficie de práctica para pruebas unitarias de JwtTokenUtil.
 * El estudiante debe implementar los casos de prueba requeridos.
 */
@ExtendWith(MockitoExtension.class)
class JwtTokenUtilTest {

    @Test
    void testGenerateToken_ValidUser_ReturnsToken() {
        // Given: un usuario válido con username y roles
        // When: se genera el token
        // Then: el token no es null ni vacío
        fail("Test no implementado");
    }

    @Test
    void testGenerateToken_ValidUser_TokenContainsExpectedClaims() {
        // Given: un usuario con username y roles específicos
        // When: se genera el token
        // Then: el token contiene el username y los roles esperados
        fail("Test no implementado");
    }

    @Test
    void testExtractUsername_ValidToken_ReturnsUsername() {
        // Given: un token JWT válido
        // When: se extrae el username
        // Then: retorna el username correcto
        fail("Test no implementado");
    }

    @Test
    void testExtractUsername_ExpiredToken_ThrowsException() {
        // Given: un token JWT expirado
        // When: se intenta extraer el username
        // Then: lanza una excepción apropiado
        fail("Test no implementado");
    }

    @Test
    void testExtractExpiration_ValidToken_ReturnsExpirationDate() {
        // Given: un token JWT válido
        // When: se extrae la fecha de expiración
        // Then: retorna una fecha futura
        fail("Test no implementado");
    }

    @Test
    void testValidateToken_ValidToken_ReturnsTrue() {
        // Given: un token JWT válido
        // When: se valida el token
        // Then: retorna true
        fail("Test no implementado");
    }

    @Test
    void testValidateToken_InvalidToken_ReturnsFalse() {
        // Given: un token JWT inválido (firma incorrecta)
        // When: se valida el token
        // Then: retorna false
        fail("Test no implementado");
    }

    @Test
    void testValidateToken_ExpiredToken_ReturnsFalse() {
        // Given: un token JWT expirado
        // When: se valida el token
        // Then: retorna false
        fail("Test no implementado");
    }

    @Test
    void testExtractRoles_ValidToken_ReturnsRoles() {
        // Given: un token JWT con roles en el payload
        // When: se extraen los roles
        // Then: retorna la lista de roles correcta
        fail("Test no implementado");
    }
}

// === ARCHIVO: src/test/java/com/fintech/payments/infrastructure/security/JwtAuthenticationFilterTest.java ===
package com.fintech.payments.infrastructure.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import java.io.IOException;
import java.util.Collections;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Superficie de práctica para pruebas unitarias de JwtAuthenticationFilter.
 * El estudiante debe implementar los casos de prueba requeridos.
 */
@ExtendWith(MockitoExtension.class)
class JwtAuthenticationFilterTest {

    @Mock
    private JwtTokenUtil jwtTokenUtil;

    @Mock
    private FilterChain filterChain;

    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @BeforeEach
    void setUp() {
        SecurityContextHolder.clearContext();
    }

    @Test
    void testDoFilterInternal_ValidToken_SetsAuthentication() throws ServletException, IOException {
        // Given: una request con header Authorization válido
        // When: se ejecuta el filtro
        // Then: establece la autenticación en el SecurityContext
        fail("Test no implementado");
    }

    @Test
    void testDoFilterInternal_NoAuthHeader_DoesNotSetAuthentication() throws ServletException, IOException {
        // Given: una request sin header Authorization
        // When: se ejecuta el filtro
        // Then: no establece autenticación y continua el filtro
        fail("Test no implementado");
    }

    @Test
    void testDoFilterInternal_InvalidToken_DoesNotSetAuthentication() throws ServletException, IOException {
        // Given: una request con token JWT inválido
        // When: se ejecuta el filtro
        // Then: no establece autenticación y continua el filtro
        fail("Test no implementado");
    }

    @Test
    void testDoFilterInternal_ExpiredToken_DoesNotSetAuthentication() throws ServletException, IOException {
        // Given: una request con token JWT expirado
        // When: se ejecuta el filtro
        // Then: no establece autenticación y continua el filtro
        fail("Test no implementado");
    }

    @Test
    void testDoFilterInternal_ValidToken_CallsFilterChain() throws ServletException, IOException {
        // Given: una request con token JWT válido
        // When: se ejecuta el filtro
        // Then: llama al siguiente filtro en la cadena
        fail("Test no implementado");
    }

    @Test
    void testExtractJwtFromRequest_ValidBearerToken_ReturnsToken() {
        // Given: un request con header Authorization: Bearer <token>
        // When: se extrae el JWT
        // Then: retorna el token sin el prefijo Bearer
        fail("Test no implementado");
    }

    @Test
    void testExtractJwtFromRequest_NoBearerPrefix_ReturnsNull() {
        // Given: un request con header sin prefijo Bearer
        // When: se extrae el JWT
        // Then: retorna null
        fail("Test no implementado");
    }
}
```
