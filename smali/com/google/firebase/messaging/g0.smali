.class public abstract Lcom/google/firebase/messaging/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Loc/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Loc/h;->a()Loc/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lmc/a;

    invoke-virtual {v0, v1}, Loc/h$a;->d(Lmc/a;)Loc/h$a;

    move-result-object v0

    invoke-virtual {v0}, Loc/h$a;->c()Loc/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/g0;->a:Loc/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/g0;->a:Loc/h;

    invoke-virtual {v0, p0}, Loc/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lzc/b;
.end method
