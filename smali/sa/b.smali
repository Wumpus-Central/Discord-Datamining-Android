.class public final Lsa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final k:Lsa/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsa/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsa/b;-><init>(ZLsa/d;)V

    sput-object v0, Lsa/b;->k:Lsa/b;

    return-void
.end method

.method private constructor <init>(ZLsa/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(ZLsa/c;)Lsa/b;
    .locals 0

    sget-object p0, Lsa/b;->k:Lsa/b;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method
