# LiftQuest

A gamified gym progress tracker for Android. Log your workouts, earn XP, level up and climb through personal rank tiers, all offline and just for you.

Built with Kotlin and Jetpack Compose for the **Programming Mobile Devices (SOFT7035)** module at Munster Technological University, Cork.

## The problem

Most gym trackers are spreadsheets with a UI. They record numbers but give little reason to come back. LiftQuest keeps the useful part (logging sets, reps and weight, and seeing progress over time) and adds a game layer so consistency feels rewarding.

**Target audience:** beginner to intermediate gym-goers who want motivation and simple progress tracking without social pressure or subscriptions.

## Features

| Feature | Description |
|---|---|
| Exercise library | Sample exercises grouped by muscle group, with the option to add your own |
| Workout logging | Record sets, reps and weight for each exercise in a session |
| XP and levels | Earn XP for every set, personal record, finished workout and training streak |
| Personal ranks | Bronze, Silver, Gold, Platinum and Diamond tiers based on your level |
| Achievements | Unlockable badges for milestones such as first workout or a 7-day streak |
| Progress charts | Visualise weight lifted and XP over time |
| Reminders | Scheduled workout notifications |
| Settings | Theme and reminder preferences |

## XP and rank system

| Action | XP |
|---|---|
| Completed set | 10 to 30 |
| New personal record | +50 |
| Finished workout | +100 |
| Daily streak bonus | +10 per day, capped at 50 |

Level `n` needs `100 x n` XP.

| Rank | Levels |
|---|---|
| Bronze | 1 to 9 |
| Silver | 10 to 19 |
| Gold | 20 to 29 |
| Platinum | 30 to 39 |
| Diamond | 40+ |

## Tech stack

| Area | Technology |
|---|---|
| Language | Kotlin |
| UI | Jetpack Compose, Material Design 3 |
| Navigation | Navigation Compose |
| Architecture | MVVM (UI, ViewModel with StateFlow, Repository, Room) |
| Database | Room (SQLite) |
| Background work | WorkManager (reminders) |
| Settings storage | DataStore |

## Database design

Room entities: `Exercise`, `Workout`, `WorkoutSet`, `UserProfile`, `Achievement`.

## Architecture

```
UI (Compose screens)
        |
   ViewModel (StateFlow)
        |
    Repository
        |
   Room database
```

An `XpEngine` class holds the XP, level and rank rules so they stay separate from the UI.

## Screens

- Home / dashboard (level, XP bar, rank, streak)
- Exercise library
- Active workout and set logging
- Progress charts
- Achievements
- Settings

## Getting started

1. Clone the repository.
2. Open the project in Android Studio.
3. Let Gradle sync.
4. Run on an emulator or a physical device.

## Roadmap

- [ ] Project setup and dependencies
- [ ] Data layer (entities, DAOs, database)
- [ ] Exercise library
- [ ] Workout logging
- [ ] XP engine and levels
- [ ] Ranks and rank-up animation
- [ ] Achievements
- [ ] Progress charts
- [ ] Reminders
- [ ] Settings and polish

Possible extras if time allows: 3D rank-up animation, animated exercise demonstrations.

## Author

Jakub Orlowski, BSc (Hons) Software Development, MTU Cork.
