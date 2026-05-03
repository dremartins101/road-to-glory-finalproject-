# road-to-glory-finalproject-
A text based game that lets you live out your footballing dreams. Will you win the ballon d'or, and bring glory to your country?

```mermaid
classDiagram
    class Player {
        -String name
        -String position
        -int age
        -Stats stats
        -CareerHistory history
        +calculateSeasonPerformance()
        +applyCountryBoost()
    }

    class Stats {
        -int pace
        -int shooting
        -int dribbling
        -int passing
        -int defending
        -int physical
        +getters/setters()
    }

    class Club {
        -String name
        -int prestigeTier
        -String league
    }

    class League {
        -String name
        -ArrayList~Club~ clubs
        +getRandomClub(int tier)
    }

    class CareerHistory {
        -SeasonNode head
        +addSeason(SeasonNode newSeason)
        +displayFullCareer()
    }

    class SeasonNode {
        -int year
        -int goals
        -int assists
        -String trophies
        -SeasonNode next
    }

    class SimulationEngine {
        +generateStats(Player p, Club c)
        +determineTrophies(Player p, Club c)
    }

    Player *-- Stats : Composition
    Player *-- CareerHistory : Composition
    CareerHistory o-- SeasonNode : Aggregation
    League o-- Club : Aggregation
    SimulationEngine ..> Player : Uses
    SimulationEngine ..> Club : Uses
