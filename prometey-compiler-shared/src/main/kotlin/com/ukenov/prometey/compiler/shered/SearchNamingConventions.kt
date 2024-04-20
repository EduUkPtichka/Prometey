package com.ukenov.prometey.compiler.shered

import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName

/**
 * [SearchNamingConventions]
 */

/*
*  Предположительно через FqName - мы регистрируем полное имя до класса для компилятора Kotlin,
* видимо благодаря этому он найдет класс.
*
*  А через ClassId.topLevel - мы получаем имя самого класса ScannerClass
*/

object SearchNamingConventions {

    val prometeyAnnotationConfigurationFqName = FqName("com.ukenov.prometey.api.annotation.Configuration")

    val prometeyAnnotationScannerClassClassId = ClassId.topLevel(
        prometeyAnnotationConfigurationFqName
    )

}