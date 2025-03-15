Smart Home Control System

Overview

In this project i implement a Smart Home Control System using multiple design patterns to demonstrate a structured approach to managing smart devices.

Design Patterns Used:

1.Composite Pattern: Groups multiple devices into hierarchical structures (e.g., rooms containing lights and thermostats).

2.Decorator Pattern: Adds additional functionality to devices (e.g., logging actions with LoggingDecorator).

3.Abstract Factory Pattern: Provides factories (BasicSmartHomeFactory and AdvancedSmartHomeFactory) for creating different types of smart devices.

4.Facade Pattern: The SmartHomeController simplifies interaction with multiple devices by providing centralized control methods.

5.Adapter Pattern: Integrates a legacy security system into the smart home environment via SecuritySystemAdapter.

Features:
1.Creating and managing smart devices (lights, thermostats, security systems).

2.Grouping devices into rooms for easier control.

3.Enhance device functionality dynamically using decorators.

4.Use a facade to simplify system interaction.

5.Integrate legacy systems via an adapter.

6.Interactive console-based menu (SmartHomeInteractive) for user control.

