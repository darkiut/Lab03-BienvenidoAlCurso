package com.tecsup.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecsup.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

/**
 * Laboratorio 03 - Jetpack Compose
 * Alumno: Jose Carlos Vitorino Condori
 * Fecha: 10/11/2025
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Pantalla principal - Tarjeta de Presentación Mejorada
                    TarjetaPresentacionMejorada()
                }
            }
        }
    }
}

/**
 * Composable principal - Jose Carlos Vitorino Condori
 */
@Composable
fun BienvenidoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bienvenido",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6200EE)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Al Curso de Programación en Móviles",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BienvenidoScreenPreview() {
    BienvenidoAlCursoTheme {
        BienvenidoScreen()
    }
}

/**
 * ==========================================
 * PUNTO 7: EXPLORACIÓN DE COMPONENTES
 * Alumno: Jose Carlos Vitorino Condori
 * ==========================================
 */

// 1. TextField - Campo de texto editable
@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TextField - Campo de texto",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Texto ingresado: $text")
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldExamplePreview() {
    BienvenidoAlCursoTheme {
        TextFieldExample()
    }
}

// 2. Button - Botón interactivo
@Composable
fun ButtonExample() {
    var clickCount by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Button - Botón",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { clickCount++ }) {
            Text("Haz clic aquí")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Clicks: $clickCount")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonExamplePreview() {
    BienvenidoAlCursoTheme {
        ButtonExample()
    }
}

// 3. Image - Muestra de imágenes
@Composable
fun ImageExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Image - Imagen",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo Android",
            modifier = Modifier.size(150.dp)
        )
        Text(text = "Icono de la aplicación")
    }
}

@Preview(showBackground = true)
@Composable
fun ImageExamplePreview() {
    BienvenidoAlCursoTheme {
        ImageExample()
    }
}

// 4. Row - Disposición horizontal
@Composable
fun RowExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Row - Disposición Horizontal",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { }) {
                Text("Botón 1")
            }
            Button(onClick = { }) {
                Text("Botón 2")
            }
            Button(onClick = { }) {
                Text("Botón 3")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowExamplePreview() {
    BienvenidoAlCursoTheme {
        RowExample()
    }
}

// 5. Column - Disposición vertical
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Column - Disposición Vertical",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Elemento 1")
        Text("Elemento 2")
        Text("Elemento 3")
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnExamplePreview() {
    BienvenidoAlCursoTheme {
        ColumnExample()
    }
}

// 6. Card - Tarjeta con elevación
@Composable
fun CardExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Card - Tarjeta",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE3F2FD)
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Título de la tarjeta",
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Esta es una tarjeta de ejemplo con información.")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardExamplePreview() {
    BienvenidoAlCursoTheme {
        CardExample()
    }
}

// 7. Checkbox - Casilla de verificación
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Checkbox - Casilla",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }
            )
            Text(text = "Acepto los términos y condiciones")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = if (checked) "Aceptado" else "No aceptado")
    }
}

@Preview(showBackground = true)
@Composable
fun CheckboxExamplePreview() {
    BienvenidoAlCursoTheme {
        CheckboxExample()
    }
}

// 8. RadioButton - Botón de opción
@Composable
fun RadioButtonExample() {
    var selectedOption by remember { mutableStateOf("Opción 1") }
    val options = listOf("Opción 1", "Opción 2", "Opción 3")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "RadioButton - Botón de opción",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (option == selectedOption),
                    onClick = { selectedOption = option }
                )
                Text(text = option)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Seleccionado: $selectedOption")
    }
}

@Preview(showBackground = true)
@Composable
fun RadioButtonExamplePreview() {
    BienvenidoAlCursoTheme {
        RadioButtonExample()
    }
}

/**
 * ==========================================
 * PUNTO 8: TARJETA DE PRESENTACIÓN
 * Alumno: Jose Carlos Vitorino Condori
 * ==========================================
 */

@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF073042)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Sección superior: Logo y nombre
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            // Imagen de perfil circular
            Image(
                painter = painterResource(id = R.drawable.profile_image),
                contentDescription = "Foto de perfil",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nombre completo
            Text(
                text = "Jose Carlos Vitorino Condori",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Título profesional
            Text(
                text = "Desarrollador Android",
                fontSize = 18.sp,
                color = Color(0xFF3ddc84),
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(48.dp))

        // Sección inferior: Información de contacto
        Column(
            modifier = Modifier.padding(horizontal = 32.dp)
        ) {
            ContactInfo(
                icon = Icons.Default.Phone,
                info = "+51 987 654 321"
            )

            Spacer(modifier = Modifier.height(16.dp))

            ContactInfo(
                icon = Icons.Default.Share,
                info = "@josecarlosvitorino"
            )

            Spacer(modifier = Modifier.height(16.dp))

            ContactInfo(
                icon = Icons.Default.Email,
                info = "josecarlos@tecsup.edu.pe"
            )
        }
    }
}

/**
 * Componente reutilizable para información de contacto
 * Jose Carlos Vitorino Condori
 */
@Composable
fun ContactInfo(icon: ImageVector, info: String) {
    Divider(
        color = Color(0xFF526E7B),
        thickness = 1.dp
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = info,
            color = Color.White,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    BienvenidoAlCursoTheme {
        TarjetaPresentacion()
    }
}

/**
 * ==========================================
 * PUNTO 9: TARJETA MEJORADA CON INTERACTIVIDAD
 * Alumno: Jose Carlos Vitorino Condori
 * ==========================================
 */

@Composable
fun TarjetaPresentacionMejorada() {
    var isDarkMode by remember { mutableStateOf(false) }

    val backgroundColor = if (isDarkMode) Color(0xFF1A1A1A) else Color(0xFF073042)
    val accentColor = if (isDarkMode) Color(0xFFFF6B6B) else Color(0xFF3ddc84)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Sección superior: Logo y nombre
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            // Imagen de perfil circular con borde
            Card(
                modifier = Modifier.size(160.dp),
                shape = CircleShape,
                colors = CardDefaults.cardColors(
                    containerColor = accentColor
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile_image),
                        contentDescription = "Foto de perfil",
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Nombre completo
            Text(
                text = "Jose Carlos Vitorino Condori",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Título profesional
            Card(
                modifier = Modifier.padding(8.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = accentColor.copy(alpha = 0.2f)
                )
            ) {
                Text(
                    text = "Desarrollador Android",
                    fontSize = 16.sp,
                    color = accentColor,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Sección inferior: Información de contacto
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = 0.1f)
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                ContactInfoMejorada(
                    icon = Icons.Default.Phone,
                    info = "+51 995 568 702",
                    accentColor = accentColor
                )

                Spacer(modifier = Modifier.height(12.dp))

                ContactInfoMejorada(
                    icon = Icons.Default.Share,
                    info = "josecarlosvitorinocondori@gmail.com",
                    accentColor = accentColor
                )

                Spacer(modifier = Modifier.height(12.dp))

                ContactInfoMejorada(
                    icon = Icons.Default.Email,
                    info = "josecarlos@tecsup.edu.pe",
                    accentColor = accentColor
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Botón para cambiar el tema
        Button(
            onClick = { isDarkMode = !isDarkMode },
            colors = ButtonDefaults.buttonColors(
                containerColor = accentColor
            ),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text(
                text = if (isDarkMode) "Modo Claro" else "Modo Oscuro",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
            )
        }
    }
}

/**
 * Componente mejorado para información de contacto
 * Jose Carlos Vitorino Condori
 */
@Composable
fun ContactInfoMejorada(icon: ImageVector, info: String, accentColor: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(40.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(
                containerColor = accentColor.copy(alpha = 0.2f)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = accentColor,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = info,
            color = Color.White,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionMejoradaPreview() {
    BienvenidoAlCursoTheme {
        TarjetaPresentacionMejorada()
    }
}
