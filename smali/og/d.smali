.class public final Log/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Llh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llh/c;

    const-string v1, "kotlin.internal.PlatformDependent"

    invoke-direct {v0, v1}, Llh/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Log/d;->a:Llh/c;

    return-void
.end method

.method public static final a()Llh/c;
    .locals 1

    sget-object v0, Log/d;->a:Llh/c;

    return-object v0
.end method
