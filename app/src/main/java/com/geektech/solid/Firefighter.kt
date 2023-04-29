package com.geektech.solid

//S-Single responsibility principle-single responsibility of fireman
//I-Interface Segregation Principle, there is one interface which can do worker, improve

open class Firefighter:Improve {

    open fun driveFireEngine() {

    }

    open fun putOutTheFire() {

    }

   open fun savePeople() {

    }

    override fun improve() {
        TODO("Not yet implemented")
    }
}

// D-Dependency Inversion Principle it doesn't depend on class Payment it depends on interface PaySalary

class FireDepartmentAccountant(paySalary: PaySalary) {

    var salary = 5000
    fun paySalary() {

    }
// O-Open-Closed Principle, we don't delete code and we just add some details for it

    fun payHolidayPay(holidayCountDay: Int) {

        if (holidayCountDay <= 10) {
            salary = salary * 2 / holidayCountDay
        } else
            if (holidayCountDay >= 20)
                salary = salary * 2
    }
}

class Administration() {

    fun answerCalls() {

    }
}