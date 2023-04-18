.class final Lj$/time/format/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/Comparator;

.field public static final synthetic c:I


# instance fields
.field final synthetic a:Lj$/time/format/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x2

    const/16 v2, 0x10

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v3, v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    new-instance v0, Lj$/time/format/c;

    invoke-direct {v0}, Lj$/time/format/c;-><init>()V

    sput-object v0, Lj$/time/format/b;->b:Ljava/util/Comparator;

    return-void
.end method

.method constructor <init>(Lj$/time/format/s;)V
    .locals 0

    iput-object p1, p0, Lj$/time/format/b;->a:Lj$/time/format/s;

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lj$/time/format/b;->b:Ljava/util/Comparator;

    return-object v0
.end method
