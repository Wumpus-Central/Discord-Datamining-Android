.class public interface abstract Lmg/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmg/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/b1$a;

    invoke-direct {v0}, Lmg/b1$a;-><init>()V

    sput-object v0, Lmg/b1;->a:Lmg/b1;

    return-void
.end method


# virtual methods
.method public abstract getName()Ljava/lang/String;
.end method
