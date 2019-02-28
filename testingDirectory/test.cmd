cp -rv ../lib/* ../artifacts/info.kgeorgiy.java.advanced.base.jar ../artifacts/info.kgeorgiy.java.advanced.student.jar .
cp -rv ../src/* .
javac ru/ifmo/rain/dolgikh/student/* && java -cp . -p . -m info.kgeorgiy.java.advanced.student StudentQuery ru.ifmo.rain.dolgikh.student.StudentDB
