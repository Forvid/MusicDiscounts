fun main() {
    // Пример значения суммы покупки и статуса покупателя
    val purchaseAmount = 15000.0
    val isRegularCustomer = true

    // Вызов функции для расчета итоговой стоимости
    val finalAmount = calculateFinalAmount(purchaseAmount, isRegularCustomer)

    // Вывод результата
    println("Итоговая стоимость покупки: ${finalAmount.toInt()} рублей")
}

// Функция для расчета итоговой стоимости с учетом скидок
fun calculateFinalAmount(amount: Double, isRegularCustomer: Boolean): Double {
    val discount = when {
        amount <= 1000 -> 0.0
        amount in 1001.0..10000.0 -> 100.0
        else -> amount * 0.05
    }
    var amountAfterDiscount = amount - discount
    if (isRegularCustomer) {
        amountAfterDiscount *= 0.99
    }
    return amountAfterDiscount
}
