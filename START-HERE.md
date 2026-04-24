## What is SQL-SI?

SQL-SI upgrades SQL into a Structural Intelligence system by adding:

- reusable structure (CCC)
- temporal modeling (trajectory)
- similarity (metric space)
- decision (PDS)

## Mental Model

Traditional SQL:

    data → query → result

SQL-SI:

    data → structure → CCC → metric → decision → result
    
## 3 Key Innovations

### 1. Structural Objects

Persist:

- trajectory
- graph
- CCC

### 2. Metric Space

Everything becomes comparable:

    distance(a, b)
    
### 3. CCC (Core)

Extract invariant patterns:

    stable + reusable + comparable
    
## Minimal Example

    Input: events(user, time, action)
    
    → build trajectory
    → detect pattern
    → store CCC
    → query similar users
    
## Why This Matters
- replaces recomputation with reuse
- enables real structure learning
- aligns with DBM-SI architecture

## First Use Cases
- fraud pattern detection
- behavior clustering
- trajectory similarity
- system monitoring