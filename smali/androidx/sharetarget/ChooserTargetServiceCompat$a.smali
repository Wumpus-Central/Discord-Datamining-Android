.class Landroidx/sharetarget/ChooserTargetServiceCompat$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/sharetarget/ChooserTargetServiceCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/sharetarget/ChooserTargetServiceCompat$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Landroidx/core/content/pm/ShortcutInfoCompat;

.field private final l:Landroid/content/ComponentName;


# direct methods
.method constructor <init>(Landroidx/core/content/pm/ShortcutInfoCompat;Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->k:Landroidx/core/content/pm/ShortcutInfoCompat;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->l:Landroid/content/ComponentName;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public a(Landroidx/sharetarget/ChooserTargetServiceCompat$a;)I
    .locals 1

    invoke-virtual {p0}, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->b()Landroidx/core/content/pm/ShortcutInfoCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/content/pm/ShortcutInfoCompat;->i()I

    move-result v0

    invoke-virtual {p1}, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->b()Landroidx/core/content/pm/ShortcutInfoCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/content/pm/ShortcutInfoCompat;->i()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method b()Landroidx/core/content/pm/ShortcutInfoCompat;
    .locals 1

    iget-object v0, p0, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->k:Landroidx/core/content/pm/ShortcutInfoCompat;

    return-object v0
.end method

.method c()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->l:Landroid/content/ComponentName;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/sharetarget/ChooserTargetServiceCompat$a;

    invoke-virtual {p0, p1}, Landroidx/sharetarget/ChooserTargetServiceCompat$a;->a(Landroidx/sharetarget/ChooserTargetServiceCompat$a;)I

    move-result p1

    return p1
.end method
