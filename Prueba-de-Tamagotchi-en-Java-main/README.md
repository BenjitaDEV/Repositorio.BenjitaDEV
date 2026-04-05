# Prueba-de-Tamagotchi-en-Java
😺 Es un tipo Tamagotchi en Java que funciona con la misma consola.


<h1 align="center">Kamaboko Adoptame 🐾</h1>

<p align="center">
  <strong>Kamaboko Adoptame</strong> es un simulador de cuidado de mascotas basado en consola (estilo Tamagotchi) desarrollado en Java. El objetivo es adoptar animales, gestionar sus necesidades (hambre, energía, felicidad) y verlos crecer a través de interacciones en tiempo real.
</p>

<br>

<h2>📋 Características</h2>
<ul>
  <li><strong>Sistema de Adopción:</strong> Elige entre <b>Perro</b>, <b>Gato</b> o <b>Pájaro</b>, cada uno con estadísticas iniciales y comportamientos únicos.</li>
  <li><strong>Interacción Dinámica:</strong> Puedes alimentar, jugar y hacer dormir a tus mascotas. Cada acción afecta sus barras de estado.</li>
  <li><strong>Eventos Aleatorios:</strong> Sistema de probabilidad que detona eventos especiales como "ataques de adrenalina".</li>
  <li><strong>Ciclo de Vida:</strong> Simulación del paso del tiempo que afecta las necesidades de las mascotas (envejecer).</li>
</ul>

<h2>🚀 Conceptos de POO Aplicados</h2>
<p>Este proyecto demuestra la aplicación práctica de los 4 pilares de la Programación Orientada a Objetos:</p>

<h3>1. Herencia (Inheritance)</h3>
<p>Implementación de una jerarquía de clases donde <code>Perro</code>, <code>Gato</code> y <code>Pajaro</code> heredan atributos y lógica base de la clase padre <code>Mascota</code>.</p>

<h3>2. Polimorfismo (Polymorphism)</h3>
<ul>
  <li><strong>Sobreescritura (Overriding):</strong> Cada animal implementa su propia versión de métodos como <code>emitirSonido()</code>, <code>jugar()</code> o <code>alimentar()</code>.</li>
  <li><strong>Tipado Dinámico:</strong> El gestor (<code>Duenio</code>) maneja una colección genérica <code>ArrayList&lt;Mascota&gt;</code>, permitiendo tratar a todos los animales bajo una misma estructura.</li>
</ul>

<h3>3. Abstracción (Abstraction)</h3>
<ul>
  <li><strong>Clases Abstractas:</strong> Uso de <code>abstract class Mascota</code> para definir la plantilla base que no puede ser instanciada por sí sola.</li>
  <li><strong>Interfaces:</strong> Implementación de <code>InterfaceMascota</code> para definir un contrato estricto de acciones (<code>MAX_STAT</code>, <code>alimentar</code>, <code>dormir</code>, etc.).</li>
</ul>

<h3>4. Encapsulamiento (Encapsulation)</h3>
<p>Protección del estado interno de los objetos mediante modificadores de acceso (<code>private</code>, <code>protected</code>) y validaciones en los setters para mantener las estadísticas dentro de los rangos lógicos (0-100).</p>

<h2>🛠️ Estructura del Proyecto</h2>
<p>El código sigue una arquitectura separada por paquetes:</p>

<pre>
src/
├── main/
│   └── Main.java            # Bucle principal y control de flujo
└── modelo/
    ├── InterfaceMascota.java # Contrato de comportamiento
    ├── Mascota.java          # Clase padre abstracta
    ├── Duenio.java           # Lógica del jugador y gestión de lista
    ├── Perro.java            # Subclase concreta
    ├── Gato.java             # Subclase concreta
    └── Pajaro.java           # Subclase concreta
</pre>
<br>
<p align="center">Desarrollado con ☕ y Java.</p>
