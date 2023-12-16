# Observer Pattern

@startuml
interface Subject {
  + registerObserver()
  + removeObserver()
  + notifyObservers()
}

interface Observer {
  + update(double temperature, double humidity, double pressure)
}

interface Display {
  + display()
}

@enduml