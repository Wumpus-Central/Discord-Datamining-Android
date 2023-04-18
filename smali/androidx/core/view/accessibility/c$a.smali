.class Landroidx/core/view/accessibility/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/accessibility/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method static a(Landroid/view/accessibility/AccessibilityManager;Landroidx/core/view/accessibility/c$b;)Z
    .locals 1

    new-instance v0, Landroidx/core/view/accessibility/c$c;

    invoke-direct {v0, p1}, Landroidx/core/view/accessibility/c$c;-><init>(Landroidx/core/view/accessibility/c$b;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    move-result p0

    return p0
.end method

.method static b(Landroid/view/accessibility/AccessibilityManager;Landroidx/core/view/accessibility/c$b;)Z
    .locals 1

    new-instance v0, Landroidx/core/view/accessibility/c$c;

    invoke-direct {v0, p1}, Landroidx/core/view/accessibility/c$c;-><init>(Landroidx/core/view/accessibility/c$b;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    move-result p0

    return p0
.end method
